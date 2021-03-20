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
			<c:if test="${POSITION =='영업' }">
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
					<td><a href="currdetail.bit?num=${bean.num }">${bean.num }</a></td>
			<c:if test="${not empty ID}" >
			<c:if test="${not empty POSITION }">
					<td>${bean.ID }</td>
					<td>${bean.NAME }</td>
					<td>${bean.POSITION }</td>
			</c:if>
			</c:if>
					<td><a href="currdetail.bit?num=${bean.num }">${bean.sub }</a></td>
					<td><a href="currdetail.bit?num=${bean.num }">${bean.open }</a></td>
					<td><a href="currdetail.bit?num=${bean.num }">${bean.period }</a></td>
					<td><a href="currdetail.bit?num=${bean.num }">자세히보기+</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty ID}" >
		<c:if test="${POSITION =='영업' }">
		<a href="currinsert.bit">[글쓰기]</a>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>