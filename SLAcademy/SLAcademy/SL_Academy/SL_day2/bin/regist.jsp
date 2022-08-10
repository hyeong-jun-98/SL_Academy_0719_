<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">

    <title>글등록</title>
    <!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
    <script>
        
        $(document).ready(function() {      // addEventListener("load", fundtion () { 와 같은 것 })
            $("#summernote").summernote();
            // 버튼들 중 (버튼배열) 첫번째 0버튼에 이벤트 구현
            $("#bt_regist").click(function() {
                // 폼 양식을 이용하여 서버에 전송
                $("form").attr("action", "/board/regist");
                $("form").attr("method", "post");
                $("form").submit();
            })        
        });

    </script>
</head>

<body>
    <form>
    <table width="60%" border="1px" align="center">
        <tr>
            <td>제목</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><textarea id="summernote" name="content"></textarea></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="글 등록" id="">
                <input type="button" value="목록보기" onclick="location.href='/board/list.jsp'">
            </td>
        </tr>
    </table>
</form>
</body>

</html>
