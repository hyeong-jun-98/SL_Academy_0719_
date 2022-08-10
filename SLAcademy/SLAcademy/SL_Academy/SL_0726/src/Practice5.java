import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Practice5 {
    public static void main(String[] args) {
        String address = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/RealtimeCityAir/1/25/";
        try {
            URL url = new URL(address);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            JSONParser jp = new JSONParser();
            JSONObject jo = (JSONObject) jp.parse(isr);  // 객체 1
            JSONObject jo2 = (JSONObject) jo.get("RealtimeCityAir"); // 객체 2
            JSONArray ja = (JSONArray) jo2.get("row"); // 배열 3

            for (int i = 0; i < ja.size(); i++) {
                JSONObject dust = (JSONObject) ja.get(i);
                System.out.println("측정일시 : " + dust.get("MSRDT"));
                System.out.println("권역명 : " + dust.get("MSRRGN_NM"));
                System.out.println("측정소명 : " + dust.get("MSRSTE_NM"));
                System.out.println("미세먼지 (㎍/㎥) : " + dust.get("PM10"));
                System.out.println("초미세먼지(㎍/㎥) : " + dust.get("PM25"));
                System.out.println("통합대기환경등급 : " + dust.get("IDEX_NM") + "\n");

            }

        } catch (Exception e) {

        }
    }
}
