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
			<c:forEach items="${gradeList }" var="bean">
				<tr>
					<td><a href="gradedetail.bit?group=${bean.group }">${bean.num }</a></td>
			<c:if test="${not empty ID}" >
			<c:if test="${not empty POSITION }">
					<td>${bean.ID }</td>
					<td>${bean.NAME }</td>
					<td>${bean.POSITION }</td>
			</c:if>
			</c:if>
					<td>${bean.group }df</td>
					<td>${bean.stuname }df</td>
					<td>${bean.java }df</td>
					<td>${bean.database }df</td>
					<td>${bean.framework }</td>
					<c:if test="${ not empty ID}" >
					<c:if test="${POSITION =='행정' }">
					<td><a href="gradeupdate.bit?num=${bean.num }">[수정하기]</a></td>
					<td><a href="gradedelete.bit?num=${bean.num }">[삭제하기]</a></td>
					</c:if>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty ID}" >
		<c:if test="${POSITION =='행정' }">
		<a href="gradeinsert.bit">[학생추가하기]</a>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>