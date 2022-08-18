package web0808.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
//����̸� ������ �ۼ��� �� �ִ� ���� �ƴ϶�, �����ڵ� �ۼ��� �� �ִ�.
// MyServlet�� �������� ����� �� �ִ� �����̴�.
public class MyServlet extends HttpServlet{
	
	// Ŭ���̾�Ʈ�� �ƹ��͵� ������� �ʰ� ��û�� �� ��� default�� GET ������� ���´�.
	// GET ����� ��û�� �޴� ������ �޼��尡 �Ʒ��� ���� doGet() �޼����̴�.
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); // �������� ��ü�κ��� ��� ��Ʈ���� ��´�.
		out.print("hi my name is hj.");
	}
}
