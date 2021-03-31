<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
</head>
<body>
<!-- positon, name , id 소문자로 바꿈 -->
<%@ include file="./template/header.jspf" %>
	<table>
		<thead>
			<tr>
				<th>번호</th>
			<c:if test="${ not empty id}" >
			<c:if test="${position =='영업' }">
				<th>ID</th>
				<th>이름</th>
				<th>직책</th>
			</c:if>
			</c:if>
				<th>제목</th>
				<th>개강일</th>
				<th>교육기간</th>
				<th>내용보기</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${currList }" var="bean">
				<tr>
					<td>${bean.num }</td>
			<c:if test="${not empty id}" >
			<c:if test="${not empty position }">
					<td>${bean.id }</td>
					<td>${bean.name }</td>
					<td>${bean.position }</td>
			</c:if>
			</c:if>
					<td>${bean.sub }</td>
					<td>${bean.open }</td>
					<td>${bean.period }</td>
					<td><a href="currdetail.bit?num=${bean.num }">자세히보기+</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty id}" >
		<c:if test="${position =='영업' }">
		<a href="currinsert.bit">[글쓰기]</a>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>