<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=EUC-KR">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<style type="text/css" rel="stylesheet">
.container{
	height:600px;
}
</style>
<title>게시판</title>
</head>
<body>
	<%@ include file="./template/header.jspf" %>
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