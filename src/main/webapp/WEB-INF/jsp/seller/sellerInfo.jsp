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
		<h1>판매자 정보</h1>
	
		<img width="200" src="${seller.profillimage}">
		<div class="display-4">${seller.nickname}</div>
		<h2>${seller.temperature}</h2>
	</div>

</body>
</html>