package web0808.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuServlet extends HttpServlet {//
	@Override
	// POST ���� ������� �ʴ� �� �⺻������ �������� ��û�� default�� GET ����̰�, GET ������� ���� ��û�� doGET()
	// �޼��尡 ó���Ѵ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter(); // ���� ����� ��� ��Ʈ��
		out.print("<table width = '200px' border = '1px'>");
		for (int i = 1; i <= 9; i++) {
			out.print("<tr>");
			out.print("<td> 2 X " + i + " = " + (i * 2) + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");

	}
}
