<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

</head>
<body>
<%@ include file="./template/header.jspf" %>
	<div class="container">
		<div class="row">
			<table class="table">
				<thead>
					<tr class="table-active">
					 <th scope="col" style="width: 60%">
						글 제목 : ${sessionScope.detail.title}<br>
						글쓴이 : ${sessionScope.detail.writer}<br>
						아이디: ${sessionScope.detail.id}<br>
					</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							글 내용 : ${sessionScope.detail.content}<br>
						</td>
					</tr>
				</tbody>
				<tr>
					<td>
						<a class="btn btn-primary" href="noticeboard.jsp" role="button">목 록</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
	
	
	<%@ include file="./template/footer.jspf" %>
</body>
</html>