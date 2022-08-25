<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입페이지</h1>
<hr>
쿼리스트링 ~~~ 랑 똑같은 거임(폼테그)

데이터를 주는 건(인서트 요청 같이) 무조건 post로, 겟은 쿼리스트링, 구체적 질의만 사용
겟으로 하면 우선 쿼리가 복잡해지고, 보안에 취약함(나중에 이해할 거, 엑세스 공격, 인젝션 공격 ...)

포스트는 데이터를 주소에,쿼리스트링에 담아가는 게 아니라, 바디에 데이터를 담아서 감(데이터를 insert할 때 사용)-select는 get
자, 그럼이제 포스트로 넘긴 데이터를 어케 받을까

즉, get방식 http는 뭔 데이터를 보내는지 다 볼 수 있음 => 공유기만 연결돼 있다면 갈취 쌉가능

만약 email이 안 왔다? 디버깅은 보낸구간, 여기보터 시작해야 됨 제대로 넘겨줬는가(키값에 잘 담겼는지 ...)
<form method="post" action="/user/join">
	username : <input type="text" name="username"/> <br/>
	password : <input type="text" name="password"/> <br/>
	email : <input type="text" name="email"/> <br/>	
	<button type="submit">회원가입완료</button>
	이 세개의 데이터를 들고 (키값을 통해) 겟방식으로 action에 보냄
</form>
</body>
</html>