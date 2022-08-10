public class RegistServlet extends HttpServlet {
    // 게시판 폼 양식 중 글 내용이 textarea이므로 상당한 양의 데이터가 전송되어지므로
    // Post 방식으로 전송되어 진다. 따라서 우리는 doXXX형 메서드 즁 doPost로 처리한다.

    String url = "jdbc:oracle:this:@localhost:1521:XE";
    String user = "java";
    String password = "1234";


        request.setCharacterEncoding("utf-8");
        String title = request.getParamener("title");
        String writer = request.getParamener("writer");
        String content = request.getParamener("content");

        response.setContentType("text/html;charset=utf-8");

        // 클라이언트가 받게될 응답정보 문자열은, response 객체가 가진 스트림에 적재시켜야 한ㄷ자.
        PrintWriter out = response.getWriter();
        out.print("title is " + title + "<br>");
        out.print("writer is " + writer + "<br>");
        out.print("내용 is " + content + "<br>");

        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        out.print("드라이버 ㄹ드 성공");
        } catch (SQLException e) {
            
        }

    }




