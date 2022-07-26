import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Practice {
    public static void main(String[] args) {

        String address = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2818579500";
        try {
            URL url = new URL(address);
            try {
                HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
                InputStream inputStream = huc.getInputStream();
//                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                //    String line = null;

                XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
                XmlPullParser xpp = xppf.newPullParser();
                xpp.setInput(inputStream, "utf-8");
                int what = xpp.getEventType();  // int로 반환
                String t = null;

                while (what != XmlPullParser.END_DOCUMENT) {
                    if (what == XmlPullParser.START_TAG) {   // <태그> 들이 출력된다. (start tag)
                        t = xpp.getName();
//                        System.out.println(xpp.getName());
                    } else if (what == XmlPullParser.TEXT) { // 데이터 출력
                        if (t.equals("hour")) {
                            System.out.println(xpp.getText() + "시");
                        } else if (t.equals("temp")) {
                            System.out.print(xpp.getText() + "C  ");
                        } else if (t.equals("wfKor")) {
                            System.out.println(xpp.getText());
                        }
//                        System.out.println(xpp.getText());
                    } else if (what == XmlPullParser.END_TAG) { // End Tag 출력
                        t = "";  // 엔터까지 같이 읽혀서 텍스트로 엔턱자 읽힌다. 그래서 t를 빈 값으로 만들어주고
                        // 그 뒤에가 출력되지 않게 빈 값으로 저장해놓은것,
//                        System.out.println(xpp.getName());
                    }
                    xpp.next();
                    what = xpp.getEventType();  // 태그 코드가 바뀜
                }
//                while ((line = bufferedReader.readLine()) != null) {
//                    System.out.println(line);
//                }
            } catch (IOException e) {
            } catch (XmlPullParserException e) {
            }
        } catch (MalformedURLException e) {

        }

    }
}
