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
	<div>
		글쓴이 : ${detail.writer}<br>
		아이디: ${detail.id}<br>
		글 제목 : ${detail.title}<br>
		글 내용 : ${detail.content}<br>
	</div>
	
	<div>
		<a class="btn btn-primary" href="noticeboard.jsp" role="button">Link</a>
	</div>

</body>
</html>