<%@ page contentType="text/html;charset=utf-8"%>
<%!
	// 선언부 영억 : 멤버영억...
	int price = 100;

	public int getPrice() {
		return price;
	}

%>

<%
// 로직 작성 (스크립틀릿 영역)

out.print("가격은 : " + getPrice());

%>

