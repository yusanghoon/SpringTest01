<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<table>
			<tr>
				<th>ID</th>
				<td>${user.id}</td>
			</tr>
			<tr>
				<th>상호명</th>
				<td>${user.office}</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${user.phoneNumber}</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>${user.address}</td>
			</tr>
			<tr>
				<th>등급</th>
				<td>${user.grade}</td>
			</tr>
			
		</table>
	</div>


</body>
</html>