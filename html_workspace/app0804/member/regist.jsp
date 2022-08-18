<%@page contentType="text/html;charset=utf-8"%>
<%@page import = "java.sql.*"%>
<%!
	// 선언부 : 멤버영역

String url="jdbc:oracle:thin:@localhost:1521:XE";
String user="java";
String password="1234";


%>
<%
//out.print("이 jsp에서 회원을 처리");
//클라이언트인 브라우저가 전송한 파라미터(전송변수 즉 html에서의 name)들을 받아보자

request.setCharacterEncoding("utf-8");
String user_id = request.getParameter("user_id");
String pass = request.getParameter("pass");
String user_name = request.getParameter("user_name");
String mail_id = request.getParameter("mail_id");
String myserver = request.getParameter("myserver");
String mail_server = request.getParameter("mail_server");
String tel1 = request.getParameter("tel1");
String tel2 = request.getParameter("tel2");
String tel3 = request.getParameter("tel3");
String social1= request.getParameter("social1");
String social2 = request.getParameter("social2");
String gender = request.getParameter("gender");

// 취미는 배열로 되어 있으므로 배열로 받아야 한다.
String [] hobby = request.getParameterValues("hobby");
out.print(hobby);


out.print("user_id의 값은 : " + user_id);
out.print("<br>");
out.print("pass 값은 : " + pass);
out.print("<br>");
out.print("user_name 값은 : " + user_name);
out.print("<br>");
out.print("mail_id 값은 : " + mail_id);
out.print("<br>");
out.print("myserver 값은 : " + myserver.length());
out.print("<br>");
out.print("mail_server 값은 : " + mail_server);
out.print("<br>");
out.print("social1 값은 : " + social1);
out.print("<br>");
out.print("social2 값은 : " + social2);
out.print("<br>");
out.print("gender 값은 : " + gender);
out.print("<br>");

String email = null;
String s = null;
if(myserver.length() > 0){  // 직접입력 -> 최우선으로 입력
	s = myserver;
	} else {
		s = mail_server;
	}

email = mail_id +"@"+s; 

/*
<!-- 오라클의 테이블에 레코드 넣기 -->
<!-- 1. 해당 DBMS 제품에 맞는 드라이버 로드
2. 접속
3. 쿼리문
4. 자원 관련된 객체 해제
 -->
*/
Class.forName("oracle.jdbc.driver.OracleDriver");


Connection con = DriverManager.getConnection(url, user, password);
// 트랜잭션은 con 객체로 제어하는 것이다.
// 데이터베이스의 종류가 여러가지 임과 상관없이 con 객체는 기본적으로 autocommit()이 적용되어 있다.


if(con == null)  {
	out.print("fail <br>");
} else {
	out.print("success <br>");
}

con.setAutoCommit(false); // 자동 커밋을 비활성화

try {
	String sql = "insert into member(member_id, user_id, pass, user_name, email, tel1, tel2, tel3, social1, social2, gender)";

	sql+=" values(seq_member.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	// PreparedStatement는 인터페이스 이므로 , new로 생성할 수 없다.
	// Connection 객체로부터 인스턴스를 얻어올 수 있다.
	// 즉 접속이 성공되면 얻어올 수 있다.
	PreparedStatement pstmt = con.prepareStatement(sql);
	// 바인드 변수 값 설정
	pstmt.setString(1,user_id);
	pstmt.setString(2,pass);
	pstmt.setString(3,user_name);
	pstmt.setString(4,"temp");
	pstmt.setString(5,tel1);
	pstmt.setString(6,tel2);
	pstmt.setString(7,tel3);
	pstmt.setString(8,social1);
	pstmt.setString(9,social2);
	pstmt.setString(10,gender);

	int result = pstmt.executeUpdate(); // DML 수행메서드.

	if(result == 0) {
		out.print("fail");
	} else {
		out.print("success");
		}
	// 멤버 테이블에 레코드가 입력된 시점에 얼른 pk 인 member_id를 가져와야 한다.
	sql="select seq_member.currval as member_id from dual";

		PreparedStatement pstmt2 = con.prepareStatement(sql);
		ResultSet rs = pstmt2.executeQuery();
	int member_id  = 0;
	if(rs.next()) {
	member_id	= rs.getInt("member_id");
	}


	// hobby 테이블에 취미 넣기

	PreparedStatement pstmt3 =null;

	for(int i = 0; i < hobby.length;i++) {
	sql="insert into hobby(hobby_id, member_id, hobby_name) values (seq_hobby.nextVal, ?, ?)";
	pstmt3 =  con.prepareStatement(sql);
	pstmt3.setInt(1,member_id);
	pstmt3.setString(2, hobby[i]);
		pstmt3.executeUpdate();
	}
	con.commit();

} catch (SQLExeption e) {
	//어떤 이유에서건 에러가 발생한다.
	con.rollback();  // 기존에 수행했던 모든 DML은 처음부터 없었던 것으로 돌려 놓으라.
} finally {
	con.setAutoCommit(true);
}






if(rs != null)	rs.close();
if(pstmt2 != null)	pstmt2.close();
if(pstmt3 != null)	pstmt3.close();
if(pstmt != null)	pstmt.close();
if(con != null)	con.close();



%>
회원가입 완료