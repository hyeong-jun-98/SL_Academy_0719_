<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="200px" border="1px">
		<%
			for (int i = 1; i <= 9; i++) {
		%>
		<tr>
			<td><%="2 X " + i + "= " + (2 * i)%></td>
		</tr>
		<%
		}
	%>
	</table>
	
</body>
</html>