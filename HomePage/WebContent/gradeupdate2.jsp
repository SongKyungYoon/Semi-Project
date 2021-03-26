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
	<c:set var="bean" value="${gradeDetail }"></c:set>
	<form method="POST">
		<div>
			<label>번호</label>
			<input type="text" name="num" readonly="readonly" value="${gradeDetail.num }"/>
		</div>
		<div>
			<label>반</label>
			<input type="text" name="group" readonly="readonly" value="${gradeDetail.group }"/>
		</div>
		<div>
			<label>학생명</label>
			<input type="text" name="stuname" readonly="readonly" value="${gradeDetail.stuname }"/>
		</div>
		<div>
			<label>java</label>
			<c:choose>
			<c:when test="${gradeDetail.java == 0}">
			<input type="text" name="java" value="${gradeDetail.java }"/>
   			</c:when>
			<c:otherwise>
			<input type="text" name="java" readonly="readonly" value="${gradeDetail.java }"/>
			</c:otherwise>
			</c:choose>
		</div>
		<div>
			<label>database</label>
			<c:choose>
			<c:when test="${gradeDetail.database == 0}">
			<input type="text" name="database" value="${gradeDetail.database }"/>
   			</c:when>
			<c:otherwise>
			<input type="text" name="database"  readonly="readonly" value="${gradeDetail.database }"/>
			</c:otherwise>
			</c:choose>
		</div>
		<div>
			<label>framework</label>
			<c:choose>
			<c:when test="${gradeDetail.framework == 0}">
			<input type="text" name="framework" value="${gradeDetail.framework }"/>
   			</c:when>
			<c:otherwise>
			<input type="text" name="framework" readonly="readonly" value="${gradeDetail.framework }"/>
			</c:otherwise>
			</c:choose>
		</div>
        <div>
        	<button>입력</button>
        </div>
	</form>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>