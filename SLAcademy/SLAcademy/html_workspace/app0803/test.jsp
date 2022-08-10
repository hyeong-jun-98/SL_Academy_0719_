<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
</head>
<body>
<%
	out.print("this is my first web application");
	// 우리 오라클 서버에 접속
	String url ="jdbc:oracle:thin:@localhost:1521:XE";
	String user="java";
	String password="1234";

	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection con = DriverManager.getConnection(url, user, password);
	if(con == null) {
		out.print("실패");	
	} else {
		out.print("성공");
	
	
	PreparedStatement pstmt = null;
	String sql= "select * from emp";
	pstmt = con.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();

	out.print("<table border =  '1px'>");
	while(rs.next()) {
		out.print("<tr>");
		out.print( "<td>" + rs.getInt("ename") + "</td>");
		
		out.print("</tr>");
	}
	out.print("</table>");
	}

	if(con!=null) {
		con.close();
	}

%>
</body>
</html>


