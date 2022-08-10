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

	//확장자를 추출하는 메서드
	public String getExt(String path) {
		return path.substring(path.lastIndexOf(".") + 1, path.length());

	}

%>
<%
	//클라이언트가 보낸 파일을 서버에 업로드 처리하려면 많은 로직이 수반되므로누군가가 만들어 놓은
	// 라이브러리를 이용해보자, 우리가 사용할 라이브러리는 cos.jar이며, 이 라이브러리 중 MultipartRequest
	// 클래스가 업로드를 처리하는 클래스이다.

	// 아래와 같이 이미지가 업로드 될 경로를 해당 운영체제에 맞게 고정시켜버리면, 다른 플랫폼 기반에서는
	// 애플리캐이션을 또 수정해야 하므로 , 아래와 같은 하드코딩은 하지말자.
	// 해결책 : 앞으로 배우게 될 jsp 내장객체 중 현재 웹 어플리케이션의 전반적인 정보를 다루는 객체인 애플리케이션 객체를 이용하면 된다
	String saveDir=application.getRealPath("/data");
	out.print("디렉토리의 실제 위치는 " + saveDir + "입니다 <br>");
	int maxSize =1024* 1024* 3 ;
	String encoding = "utf-8";
	MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding);
	
	
	// 클라이언트의 브라우저에서 전송한 파라미터들을 받자.
	// request.setCharacterEncoding("utf-8");
	String title = multi.getParameter("title");
	String spot = multi.getParameter("spot");
	String detail = multi.getParameter("detail");
	// 클라ㅣㅇ언트가 전송한 원래 이미지명 추출.
	File file = multi.getFile("myfile");
	String filename = file.getName();
	out.print("파일명 : " + filename);
	// 파일의 이름을 아직 바꾸지 않았으므로, insert를 먼저 실행 후 
	// primary key를 이용하여 파일명으로 사용해본다. (ex) 54 -> 54.jpg)



	Class.forName("com.mysql.jdbc.Driver");
	
	 con = DriverManager.getConnection(url, user, password);
	// 업로드는 인서트 업데이트 모두 성공해야 전체를 성공으로 간두.
	// 세부업무는 두개짜리 트랜잭션
	con.setAutoCommit(false);
	
	try {
		String sql = "insert into gallery(title, spot, detail) values(?,?,?)";
		 pstmt = con.prepareStatement(sql);
		pstmt.setString(1,title);
		pstmt.setString(2,spot);
		pstmt.setString(3,detail);
		int result = pstmt.executeUpdate();    // DML인 경우
		
		// 파일명 바꾸기 연습
		
		// 현재 이 Connection애서 일으킨 가장 마지막 primary key를 억어오기
		// 주의) select max() 쓰지말고 다른 사람이 일으킨 깂도 가져오기 때문ㅇ.

		sql = "select last_insert_id() as gallery_id";
		pstmt = con.prepareStatement(sql);
		 rs = pstmt.executeQuery();


		int gallery_id = 0;
		if(rs.next()) {
			gallery_id = rs.getInt("gallery_id");
		}
		String lastname = gallery_id +"."+ getExt(filename);
		boolean result2 = file.renameTo(new File(saveDir+ "/" +lastname));
				
		if(result2) {
			sql = "update gallery set filename = ? where gallery_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,lastname);
			pstmt.setInt(2,gallery_id);
			pstmt.executeUpdate();
		}
		con.commit();
	} 	catch (SQLException e) {
		con.rollback();
	} finally {
		con.setAutoCommit(true);
	}
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();

		// 등록이 완료되면, 클라이언트의 브라우저로 하여금 우리가 지정한 페이지를 다시 접속하도록 명령
		response.sendRedirect("/list.jsp");


%>
