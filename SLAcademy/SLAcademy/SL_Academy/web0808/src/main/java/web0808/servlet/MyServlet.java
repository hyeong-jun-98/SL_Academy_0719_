package web0808.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//고양이만 서블릿을 작성할 수 있는 것이 아니라, 개발자도 작성할 수 있다.
// MyServlet은 서버에서 실행될 수 있는 서블릿이다.
public class MyServlet extends HttpServlet{
	
	// 클라이안트가 아무것도 명시하지 않고 요청을 할 경우 default는 GET 방식으로 들어온다.
	// GET 방식의 요청을 받는 서블릿의 메서드가 아래와 같은 doGet() 메서드이다.
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); // 응답정보 객체로부터 출력 스트림을 얻는다.
		out.print("hi my name is hj.");
	}
}
