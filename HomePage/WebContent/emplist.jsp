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
<%@ include file="./template/header.jspf" %>
	<table>
		<thead>
			<tr>
				<th>번호</th>
			<c:if test="${ not empty ID}" >
			<c:if test="${POSITION =='취업' }">
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
					<td><a href="empdetail.bit?num=${bean.num }">${bean.num }</a></td>
			<c:if test="${not empty ID}" >
			<c:if test="${not empty POSITION }">
					<td>${bean.ID }</td>
					<td>${bean.NAME }</td>
					<td>${bean.POSITION }</td>
			</c:if>
			</c:if>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">${bean.coname }</a></td>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">${bean.nalja }</a></td>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">${bean.deadline }</a></td>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">${bean.coposition }</a></td>
					<td><a href="empdetail.bit?num=${bean.num }&count=${bean.count }">자세히보기+</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty ID}" >
		<c:if test="${POSITION =='취업' }">
		<a href="empinsert.bit">[글쓰기]</a>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>