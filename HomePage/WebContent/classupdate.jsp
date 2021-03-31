<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript">
	$(function(){
		 CKEDITOR.replace( 'editor1' );
	});
</script>
</head>
<body>
<%@ include file="./template/header.jspf" %>
	<c:set var="bean" value="${classDetail }"></c:set>
	<div class="container">
		<form method="POST">
			<ul class="list-group">
				<li class="list-group-item">
					<label>번호</label>
					<input type="text" name="num" readonly="readonly" value="${classDetail.num }"/>
				</li>
				<li class="list-group-item">
					<label>반</label>
					<input type="text" name="group" value="${classDetail.group }"/>
				</li>
				<li class="list-group-item">
					<label>강사</label>
					<input type="text" name="gangsa" value="${classDetail.gangsa }"/>
				</li>
				<li class="list-group-item">
					<label>기간</label>
					<input type="text" name="period" value="${classDetail.period }"/>
				</li>
	        </ul>
	        <div>
	        	<button type="button" class="btn btn-primary btn-lg btn-block">입력</button>
	        </div>
        </form>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>