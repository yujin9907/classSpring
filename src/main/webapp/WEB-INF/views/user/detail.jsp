<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>디테일 페이지</h1>
어떻게 하면 db에서 가져온 정보를 뷰에 뿌릴까
<hr>
유저네임 : ${user.username} 실제로 때려지는 건 게터메서드 알아서 get을 붙이고 앞글자를 대문자로(U)바꾼 이름의 메서드를 호출하게 돼 있음<br> 
유제비번 : ${user.password}<br>
이메일 : ${user.email} <br>
</body>
</html>