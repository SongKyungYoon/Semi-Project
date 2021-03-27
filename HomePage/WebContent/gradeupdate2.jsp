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
<div class="container-md">
 <div class="row">
	<div class="col"></div>
		<div class="col-7">
			<form method="POST">
			<c:set var="bean" value="${gradeDetail }"></c:set>
		  <div class="form-group">
		    <label for="num">번호</label>
		    <input type="text" class="form-control controldeco" name="num" id="num" value="${gradeDetail.num }">
		  </div>
		  <div class="form-group">
		    <label for="group">반</label>
		    <input type="text" class="form-control controldeco" name="group" id="group" value="${gradeDetail.group }">
		  </div>
		  <div class="form-group">
		    <label for="stuname">학생명</label>
		    <input type="text" class="form-control controldeco" name="stuname" id="stuname" value="${gradeDetail.stuname }">
		  </div>
		  <div class="form-group">
		    <label for="num">java</label>
		    <c:choose>
				<c:when test="${gradeDetail.java == 0}">
					<input type="text" class="form-control " name="java" id="java" value="${gradeDetail.java }"/>
		   		</c:when>
		   		<c:otherwise>
					<input type="text" class="form-control controldeco" name="java" readonly="readonly" value="${gradeDetail.java }"/>
				</c:otherwise>
			</c:choose>
		  </div>
		  <div class="form-group">
		    <label for="database">database</label>
		    <c:choose>
				<c:when test="${gradeDetail.java == 0}">
					<input type="text" class="form-control" name="database" id="database" value="${gradeDetail.database }"/>
		   		</c:when>
		   		<c:otherwise>
					<input type="text" class="form-control controldeco" name="database" readonly="readonly" value="${gradeDetail.database }"/>
				</c:otherwise>
			</c:choose>
		  </div>
		  <div class="form-group">
		    <label for="database">framework</label>
		    <c:choose>
				<c:when test="${gradeDetail.java == 0}">
					<input type="text" class="form-control" name="framework" id="framework" value="${gradeDetail.framework }"/>
		   		</c:when>
		   		<c:otherwise>
					<input type="text" class="form-control controldeco" name="framework" readonly="readonly" value="${gradeDetail.framework }"/>
				</c:otherwise>
			</c:choose>
		  </div>
		  <button type="submit" class="btn btn-primary">입력</button>
		</form>
	  </div>
	<div class="col"></div>
	</div>
</div>
<%@ include file="./template/footer.jspf" %>
</body>
</html>