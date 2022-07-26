import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Practice2 {
    // data.go.kr
    // data.seoul.go.kr
    // data.gg.go.kr
    public static void main(String[] args) {
        String address = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/";
        try {
            URL url = new URL(address);
            try {
                HttpURLConnection huc = (HttpURLConnection) url.openConnection();
                InputStream is = huc.getInputStream();
                XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
                XmlPullParser xpp = xppf.newPullParser();
                xpp.setInput(is, "utf-8");
                int what = xpp.getEventType();
                String t = null;

                while (what != XmlPullParser.END_DOCUMENT) {
                    if (what == XmlPullParser.START_TAG) {
                        t = xpp.getName();
                    } else if (what == XmlPullParser.TEXT) {
                        if (t.equals("MSRRGN_NM")) {
                            System.out.println("권역명 : " + xpp.getText());
                        } else if (t.equals("MSRSTE_NM")) {
                            System.out.println("측정소명 : " + xpp.getText());
                        } else if (t.equals("PM10")) {
                            System.out.println("미세먼지 : " + xpp.getText());
                        } else if (t.equals("PM25")) {
                            System.out.println("초미세먼지 : " + xpp.getText());
                        } else if (t.equals("IDEX_NM")) {
                            System.out.println("통합대기환경등급 : " + xpp.getText() + "\n");

                        }
                    } else if (what == XmlPullParser.END_TAG) {
                        t = "";
                    }
                    xpp.next();
                    what = xpp.getEventType();

                }
                is.close();
            } catch (IOException e) {
            } catch (XmlPullParserException e) {
            }
        } catch (MalformedURLException e) {
        }
    }
}
