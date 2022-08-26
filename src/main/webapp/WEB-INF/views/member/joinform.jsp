<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입
<form action="/member/join" method="post">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="email" name="email">
	<button>회원가입하기</button>
	폼 안에 있으면 버튼의 기본타입이 submit임. 그냥 적어줌. 헷갈리니까
</form>
</body>
</html>