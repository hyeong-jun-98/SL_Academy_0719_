<%@ page contentType = "text/html;charset=utf8"%>
<%@ page import = "com.oreilly.servlet.MultipartRequest"%>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>
<%!
	String url = "jdbc:mysql://localhost:3306/javastudy?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;


%>


<%
	Class.forName("com.mysql.jdbc.Driver");
		String sql = "select * from gallery order by gallery_id desc";
	 con = DriverManager.getConnection(url, user, password);
	 pstmt = con.prepareStatement(sql);
	 rs = pstmt.executeQuery();


%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
</head>
<body>
	<table width = "80%" border = "1px" align="center">
		<tr>
			<td>gallery_id</td>
			<td>제목</td>
			<td>장소</td>
			<td>설명</td>
			<td>이미지</td>
		</tr>
		
		<%while(rs.next()) {%>
		<tr>
			<td><%=rs.getInt("gallery_id")%></td>
			<td><%=rs.getString("title")%></td>
			<td><%=rs.getString("spot")%></td>
			<td><%=rs.getString("detail")%></td>
			<td><img src = "/data/<%=rs.getString("filename")%>" width = "50px" height = "50px"></td>
		</tr>
		<%}%>
		<tr>
			<td colspan = "5"><button onClick = "location.href='/upload.html';">사진등록</button></td>
		</tr>

	</table>
</body>
</html>
