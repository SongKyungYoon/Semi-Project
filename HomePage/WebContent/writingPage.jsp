<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=EUC-KR">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>게시판</title>
</head>
<body>
<%@ include file="./template/header.jspf" %>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="main.jsp">웹 사이트</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link active" href="main.jsp">메인</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="board.jsp">게시판</a>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDrop" data-toggle="dropdown">
						접속하기
						</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="LoginPage.jsp">로그인</a><li>
							<li><a class="dropdown-item" href="SignUpForm.jsp">회원가입</a><li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">작성자</th>
						<th style="background-color: #eeeeee; text-align: center;">작성일</th>
						<th style="background-color: #eeeeee; text-align: center;">조회수</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>하이</td>
						<td>홍길동</td>
						<td>2021-03-02</td>
						<td>2</td>
					</tr>
					<tr>
						<td>2</td>
						<td>뭐임</td>
						<td>김밥수</td>
						<td>2021-03-02</td>
						<td>2</td>
					</tr>
					<tr>
						<td>3</td>
						<td>이하이</td>
						<td>밥치</td>
						<td>2021-03-02</td>
						<td>2</td>
					</tr>
				</tbody>
			</table>
			<a href="write.jsp" class="btn btn-primary">글쓰기</a>
		</div>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>