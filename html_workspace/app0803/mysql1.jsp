<%@ page contentType = "text/html;charset=utf-8"%>
<%@ page import = "java.sql.DriverManager"%>
<%@ page import = "java.sql.PreparedStatement"%>
<%@ page import = "java.sql.ResultSet"%>
<%@ page import = "java.sql.Connection"%>

<%
	
Class.forName("com.mysql.jdbc.Driver");

String url ="jdbc:mysql://localhost/javastudy";
String user = "root";
String password = "1234";
// 아래의 영역에서 이 변수들을 접근하기 위함
PreparedStatement pstmt =null;
ResultSet rs = null;

Connection con = DriverManager.getConnection(url, user, password);

if(con == null) {
	out.print("fail");
} else {
	out.print("success");


String sql= "select * from emp"; 
 pstmt = con.prepareStatement(sql);  //쿼리수행 객체 생성
 rs = pstmt.executeQuery();  // select 수행

}
%>

<table width = "800px" border = "1px">
	<tr>
		<td>empno</td>
		<td>ename</td>
		<td>job</td>
		<td>mgr</td>
		<td>hiredate</td>
		<td>sal</td>
		<td>comm</td>
		<td>deptno</td>
	</tr>
	<%while(rs.next()) {%>
	<tr onMouseOver="this.style.background='yellow'" onMouseOut="this.style.background=''">
		<td><%=rs.getInt("empno")%></td>
		<td><%=rs.getString("ename")%></td>
		<td><%=rs.getString("job")%></td>
		<td><%=rs.getInt("mgr")%></td>
		<td><%=rs.getString("hiredate")%></td>
		<td><%=rs.getInt("sal")%></td>
		<td><%=rs.getInt("comm")%></td>
		<td><%=rs.getInt("deptno")%></td>
	</tr>
	<%}%>
</table>

<%if(rs!=null)rs.close();%>
<%if(pstmt!=null)pstmt.close();%>
<%if(con!=null)con.close();%>

/*
JSP 란? JAVA Server Page
 - 오직 서버에서만 해석 및 실행되는 페이지 스크립트이다.
 
 JSP 작성 영역
 1) 지시 영역  표기 : <%@ %> -> 용도 : 현재 페이지에 대한 인코딩, import 등을 처리

 2) 선언부 : 표기 : <%! %> -> 용도 : 멤버변수 및 멤버 메서드를 작성할 수 있는 영역
 
 3) 스크립틀릿 : 표기 : <%%> -> 용도 : 로직을 작성하는 영역

 4) 표현식 : 표기 : <%=%> out.print(); 단축시켜놓은 표현식
 */