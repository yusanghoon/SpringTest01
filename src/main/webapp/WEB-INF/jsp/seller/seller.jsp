<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<form method="post" action="/lesson04/test01/1">
	<h1>판매자 추가</h1>
	<label>닉네임</label> <br>
	<input type="text" name="nickname">
	<label>프로필 사진 url</label> <br>
	<input type="text" name="profillimage">
	<label>온도</label> <br>
	<input type="text" name="temperature">
	<button type="submit" class="btn btn-primay">추가</button>
	</form>
</div>



</body>
</html>