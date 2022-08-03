import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain {
    public static void main(String[] args) {
        //
        String addr = "jdbc:oracle:thin:@192.168.25.81:1521:XE";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.25.81:1521:XE", "bellehee98", "0000");

            String sql = "insert into product values(8, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"이번엔");
            pstmt.setString(1,"입력로");
            pstmt.setInt(1,9876);
            pstmt.setString(1,"DDD샵");

            int a = pstmt.executeUpdate(); // spl 전송하고 실행하고 결과까지 반환해주는 역할,

            if(a>=1) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }

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


    }
}
