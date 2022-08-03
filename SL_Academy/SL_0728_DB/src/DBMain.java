import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMain {
    //
    public static void main(String[] args) {
        String addr = "jdbc:oracle:thin:@192.168.25.81:1521:XE";
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.25.81:1521:XE", "bellehee98", "0000");
            System.out.println("연결성공");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            con.close();
        } catch (Exception e) {

        }
    }

}
