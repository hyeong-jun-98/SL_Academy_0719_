import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("지역 : ");
        String region = sc.next();

        String address = "https://api.openweathermap.org/data/2.5/weather?q="+ region +"&appid=baff8f3c6cbc28a4024e336599de28c4&units=metric&lang=kr";
        try {
            URL url = new URL(address);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            JSONParser jp = new JSONParser();
            JSONObject jo = (JSONObject) jp.parse(isr);
            JSONArray ja = (JSONArray) jo.get("weather");
            JSONObject ja2 = (JSONObject) jo.get("main");
//            JSONObject ja3 = (JSONObject) jo.get("name"); // name은 객체로 안 쌓여져 있기때문에 형변환 필요 X

            for(int i = 0; i < ja.size(); i++) {
                JSONObject weather = (JSONObject) ja.get(i);  // 날씨가 배열 형태로 되어있어서 반복문을 이용해서 다시 객체로 바꿔줘야함.
                System.out.println("지역 : " + jo.get("name"));
                System.out.println("날씨 : " + weather.get("description"));
                System.out.println("온도 : " + ja2.get("temp") + " C");
                System.out.println("체감온도 : " + ja2.get("feels_like")+ " C");
                System.out.println("최저온도 : " + ja2.get("temp_min")+ " C");
                System.out.println("최고온도 : " + ja2.get("temp_max")+ " C");
                System.out.println("습도 : " + ja2.get("humidity")+ "%");
            }

        } catch (Exception e) {

        }
    }
}
