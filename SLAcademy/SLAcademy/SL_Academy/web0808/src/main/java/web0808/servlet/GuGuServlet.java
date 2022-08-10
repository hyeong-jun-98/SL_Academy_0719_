package web0808.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuServlet extends HttpServlet {
	@Override
	// POST 등을 명시하지 않는 한 기본적으로 브라우저의 요청을 default가 GET 방식이고, GET 방식으로 들어온 요청은 doGET()
	// 메서드가 처리한다
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter(); // 문자 기반의 출력 스트림
		out.print("<table width = '200px' border = '1px'>");
		for (int i = 1; i <= 9; i++) {
			out.print("<tr>");
			out.print("<td> 2 X " + i + " = " + (i * 2) + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");

	}
}
