import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Project {
    public static void main(String[] args) {

        String address_url = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/RealtimeCityAir/1/5/";
        try {
            URL url = new URL(address_url);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            JSONParser jp = new JSONParser();
            JSONObject jo = (JSONObject) jp.parse(isr);
            JSONObject jo2 = (JSONObject) jo.get("RealtimeCityAir");
            JSONArray ja = (JSONArray) jo2.get("row");


// ===============================================================================================================================


            String addr = "jdbc:oracle:thin:@192.168.25.81:1521:XE";
            Connection con = null;
            PreparedStatement pstmt = null;
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.25.81:1521:XE", "bellehee98", "0000");
                String sql = "insert into dust values(?, ?, ?, ?, ?, ?)";
                pstmt = con.prepareStatement(sql);
                JSONObject dust = null;
                for (int i = 0; i < ja.size(); i++) {
                    dust = (JSONObject) ja.get(i);
//                System.out.println("측정일시 : " + dust.get("MSRDT"));
//                System.out.println("권역명 : " + dust.get("MSRRGN_NM"));
//                System.out.println("측정소명 : " + dust.get("MSRSTE_NM"));
//                System.out.println("미세먼지 (㎍/㎥) : " + dust.get("PM10"));
//                System.out.println("초미세먼지(㎍/㎥) : " + dust.get("PM25"));
//                System.out.println("통합대기환경등급 : " + dust.get("IDEX_NM") + "\n");

                    pstmt.setString(1, dust.get("MSRDT") + "");
                    pstmt.setString(2, dust.get("MSRRGN_NM") + "");
                    pstmt.setString(3, dust.get("MSRSTE_NM") + "");
                    pstmt.setDouble(4, (Double) dust.get("PM10"));
                    pstmt.setDouble(5, (Double) dust.get("PM25"));
                    pstmt.setString(6, dust.get("IDEX_NM") + "");

                    int a = pstmt.executeUpdate(); // spl 전송하고 실행하고 결과까지 반환해주는 역할,
                }

//            if (a >= 1) {
//                System.out.println("성공");
//            } else {
//                System.out.println("실패");
//            }

            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                con.close();
            } catch (Exception e) {

            }
            try {
                pstmt.close();
            } catch (Exception e) {

            }


        } catch (
                Exception e) {

        }
    }
}
