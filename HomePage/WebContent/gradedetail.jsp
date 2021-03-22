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
	<table>
		<thead>
			<tr>
				<th>번호</th>
			<c:if test="${ not empty ID}" >
			<c:if test="${POSITION =='행정' }">
				<th>ID</th>
				<th>작성자</th>
				<th>직책</th>
			</c:if>
			</c:if>
				<th>반</th>
				<th>이름</th>
				<th>java</th>
				<th>database</th>
				<th>framework</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${gradeDetail }" var="bean">
				<tr>
					<td>${bean.num }</td>
			<c:if test="${not empty ID}" >
			<c:if test="${POSITION =='행정' }">
					<td>${bean.ID }</td>
					<td>${bean.NAME }</td>
					<td>${bean.POSITION }</td>
			</c:if>
			</c:if>
					<td>${bean.group }</td>
					<td>${bean.stuname }</td>
					<td>${bean.java }</td>
					<td>${bean.database }</td>
					<td>${bean.framework }</td>
					<c:if test="${ not empty ID}" >
					<c:if test="${POSITION =='강사' }">
					<td><a href="gradeupdate2.bit?num=${bean.num }">[입력하기]</a></td>
					</c:if>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>