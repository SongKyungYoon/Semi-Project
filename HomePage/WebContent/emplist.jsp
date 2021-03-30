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
<!-- position, name, id 소문자로 바꿈 -->
<%@ include file="./template/header.jspf" %>
	<table>
		<thead>
			<tr>
				<th>번호</th>
			<c:if test="${ not empty id}" >
			<c:if test="${position =='취업' }">
				<th>ID</th>
				<th>이름</th>
				<th>직책</th>
			</c:if>
			</c:if>
				<th>회사</th>
				<th>게시일</th>
				<th>마감일</th>
				<th>포지션</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ebbList }" var="bean">
				<tr>
					<td>${bean.num }</td>
			<c:if test="${not empty id}" >
			<c:if test="${not empty position }">
					<td>${bean.id }</td>
					<td>${bean.name }</td>
					<td>${bean.position }</td>
			</c:if>
			</c:if>
					<td>${bean.coname }</td>
					<td>${bean.nalja }</td>
					<td>${bean.deadline }</td>
					<td>${bean.coposition }</td>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">자세히보기+</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty id}" >
		<c:if test="${position =='취업' }">
		<a href="empinsert.bit">[글쓰기]</a>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>