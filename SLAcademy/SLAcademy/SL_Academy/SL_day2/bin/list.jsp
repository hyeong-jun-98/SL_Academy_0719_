<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
   <table width="100%" border="1px" align="center">
      <tr>
         <td>No</td>
         <td>제목</td>
         <td>작성자</td>
         <td>작성일</td>
         <td>조회수</td>
      </tr>
      <%for(int i=0; i<10; i++){ %>
      <tr>
         <td>No</td>
         <td>제목</td>
         <td>작성자</td>
         <td>작성일</td>
         <td>조회수</td>
      </tr>
      <%} %>
      <tr>
         <td colspan="5" align="right">
            <button onclick="location.href ='/board/regist.jsp'">글 등록</button>
         </td>
      </tr>
   </table>
</body>
</html>