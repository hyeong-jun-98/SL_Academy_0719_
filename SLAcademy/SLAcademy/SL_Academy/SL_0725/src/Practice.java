import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice { //
//    public static void cal(int x, int y) {
//        System.out.println("x + y = " + (x + y));
//        System.out.println("x - y = " + (x - y));
//        System.out.println("x * y = " + (x * y));
//        System.out.println("x / y = " + (double)(x / y));
//    }
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Practice.cal(10,5);
//        String s = "dfdfdf";
//        String a = new String("오늘_날씨_참_좋네요,종일_이랬으면");
//        // a에서 5번쨰
//        System.out.println(a.charAt(5));
//        // a가 오늘로 시작하는지
//        System.out.println(a.startsWith("오늘"));
//        //a에서  2~5번쩨
//        System.out.println(a.substring(2,5));
//        //a가 총 몇글자 인지
//        System.out.println(a.length());
//        //a의 오늘을 내일로 바꾸기
//        System.out.println(a.replace("오늘", "내일"));
//=================================================================================
//        StringBuffer, StringTokenizer 실습

//        StringBuffer sb = new StringBuffer("5454");
//        sb.append("qpqp");
//        System.out.println(sb);
//
//        StringTokenizer st = new StringTokenizer("64 64 64 98", " ");
//        System.out.println(st.nextToken());
//        System.out.println(st.countTokens());

//        int f = 10;
//        String d = String.format("%d", f);

//        String input = sc.nextLine();
//        int sum = 0;
//        StringTokenizer st = new StringTokenizer(input, "/");
//
//        while (st.hasMoreTokens()) {
//            try {
//                sum += Integer.parseInt(st.nextToken());
//            } catch (Exception e) {
//
//            }
//        }
//        System.out.println(sum);
//        sc.close();
//        System.out.print("입력 : ");
//        String msg = sc.nextLine();
        //=============================================================================
        // 파일 입출력
//        try {  // 입력
//            FileOutputStream fos1 = new FileOutputStream("D:\\text.txt");
//            OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "utf-8");
//            BufferedWriter bw1 =  new BufferedWriter(osw1);
//            bw1.write(msg + "\n");
//            bw1.flush();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {  // 출력
//            FileInputStream fis = new FileInputStream("D:\\text.txt");
//            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
//            BufferedReader br = new BufferedReader(isr);
//            String line = null;
//            while((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (Exception e) {
//
////        }
//
//================================================================================================
//          네트워크
        String address = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2818579500";
        try {
            URL url = new URL(address);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
