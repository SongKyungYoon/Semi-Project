<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	var size1,size2,size3;
	$(function(){
		function getParameterByName(name) {
		    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
		    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
		        results = regex.exec(location.search);
		    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
		}
		$(".delete").click(function(){
			$.ajax({
				url:"empdelete.bit",
				type:"POST",
				data:{num:getParameterByName('num')},
				success:function(){
					alert('삭제가 완료되었습니다.');
					location.href="emplist.bit";
				},
				
			});
		});
	});
</script>
</head>
<body>
<%@ include file="./template/header.jspf" %>
	<div class="container">
		<c:set var="bean" value="${ebbDetail }"></c:set>
			<ul class="list-group">
					<li class="list-group-item">${bean.coname }</li>
					<li class="list-group-item">게시일	│${bean.nalja }</li>
					<li class="list-group-item">마감일	│${bean.deadline }</li>
					<li class="list-group-item">포지션	│${bean.coposition }</li>
					<li class="list-group-item">조회수	│${bean.count }</li>
					<li class="list-group-item">작성자	│${bean.POSITION }</li>
			</ul>
			<div>${bean.content }</div>
			<div>
				<c:if test="${ not empty ID}" >
				<c:if test="${POSITION =='취업' }">
				<button type="button" class="delete">게시물 삭제</button>
				</c:if>
				</c:if>
			</div>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>