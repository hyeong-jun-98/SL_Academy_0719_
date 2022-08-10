import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Practice4 {
    public static void main(String[] args) {
        String address = "http://openapi.seoul.go.kr:8088/sample/json/CardSubwayStatsNew/1/5/20151101";
        try {
            URL url = new URL(address);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
//            BufferedReader br = new BufferedReader(isr);
//            System.out.println(br.readLine());

            // 처음 시작이 배열로 시작하면 JSONArray = jp.parse(isr)을 써준다.
            JSONParser jp = new JSONParser();
            JSONObject jo = (JSONObject) jp.parse(isr);  // 객체의 형태일 때 object로 변환
            JSONObject jo2 = (JSONObject) jo.get("CardSubwayStatsNew");   // 객체 모양
            JSONArray ja = (JSONArray) jo2.get("row"); // 배열 모양 , 배열 안에 또 다른 객체로 이루어져 있음
            for (int i = 0; i < ja.size(); i++) {
                JSONObject station = (JSONObject) ja.get(i);  // 객체의 모양이기 때문에 객체로 형변환을 해줘야한다.
                // 총 변환 객체 -> 객체 -> 배열 -> 객체
                System.out.println(station.get("SUB_STA_NM"));
                System.out.println(station.get("LINE_NUM"));
                System.out.println(station.get("RIDE_PASGR_NUM") + "\n");
            }
        } catch (Exception e) {

        }

    }
}
