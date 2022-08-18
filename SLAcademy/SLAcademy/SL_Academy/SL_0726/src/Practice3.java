import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Practice3 {    //
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String input = sc.next();
        try {
            input = URLEncoder.encode(input, "utf-8");
            // sort는 유사도 순서로 검색하고 display는 검색 갯수를 조정.
            String address = "https://openapi.naver.com/v1/search/news.xml?sort=sim&display=5&query=" + input;
            URL url = new URL(address);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.addRequestProperty("X-Naver-Client-Id", "tM2l0lSiRufsrhSabmRD");
            huc.addRequestProperty("X-Naver-Client-Secret", "WfeZYJ2d5H");
            InputStream is = huc.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is, "utf-8");
//            BufferedReader br = new BufferedReader(isr);
//            System.out.println(br.readLine());
            XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = xppf.newPullParser();
            xpp.setInput(is, "utf-8");
            int what = xpp.getEventType();
            String t = null;

//            for(int i = 0; i < 11; i++) {
//                xpp.next();
//            }

            while (what != XmlPullParser.END_DOCUMENT) {
                if (what == XmlPullParser.START_TAG) {
                    t = xpp.getName();

                } else if (what == XmlPullParser.TEXT) {
                    if (t.equals("title")) {
                        System.out.println(StringCleaner.clean(xpp.getText()));
                    } else if (t.equals("description")) {
                        System.out.println(StringCleaner.clean(xpp.getText()));
                        System.out.println();
                    }

                } else if (what == XmlPullParser.END_TAG) {

                }
                xpp.next();
                what = xpp.getEventType();
            }


        } catch (Exception e) {
        }
    }
}