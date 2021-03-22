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
				<th>이름</th>
				<th>직책</th>
			</c:if>
			</c:if>
				<th>반이름</th>
				<th>강사</th>
				<th>기간</th>
				<th>개설일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${classList }" var="bean">
				<tr>
					<td>${bean.num }</a></td>
			<c:if test="${not empty ID}" >
			<c:if test="${POSITION=='행정' }">
					<td>${bean.ID }</td>
					<td>${bean.NAME }</td>
					<td>${bean.POSITION }</td>
			</c:if>
			</c:if>
			<c:if test="${POSITION == '행정' || NAME == bean.gangsa}">
					<td><a href="gradedetail.bit?group=${bean.group }&gangsa=${bean.gangsa }">${bean.group }</a></td>
					<td><a href="gradedetail.bit?group=${bean.group }&gangsa=${bean.gangsa }">${bean.gangsa }</a></td>
					<td><a href="gradedetail.bit?group=${bean.group }&gangsa=${bean.gangsa }">${bean.period }</a></td>
					<td><a href="gradedetail.bit?group=${bean.group }&gangsa=${bean.gangsa }">${bean.nalja }</a></td>
					<td><a href="gradedetail.bit?group=${bean.group }&gangsa=${bean.gangsa }">자세히보기+</a></td>
			</c:if>		
					
					<c:if test="${ not empty ID}" >
					<c:if test="${POSITION =='행정' }">
					<td><a href="classupdate.bit?num=${bean.num }">[수정하기]</a></td>
					<td><a href="classdelete.bit?num=${bean.num }">[삭제하기]</a></td>
					</c:if>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<c:if test="${ not empty ID}" >
		<c:if test="${POSITION =='행정' }">
		<a href="classinsert.bit">[반개설하기]</a>
		</c:if>
		</c:if>
	</div>
</body>
</html>