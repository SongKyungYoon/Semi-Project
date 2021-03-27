<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SeongJeogPage</title>
</head>
<body >
<%@ include file="./template/header.jspf" %>

<div class="container">
	<div class="row">
	<div class="col"></div>
	<div class="col-6">
		<c:set var="dbData" value="${dbData }"></c:set>
		<ul class="list-group">
	      <li class="list-group-item col-10">이름 : ${dbData.name }</li>
		  <li class="list-group-item col-10">반 : ${dbData.group }</li>
		  <li class="list-group-item col-10">Java : ${dbData.java }</li>
		  <li class="list-group-item col-10">DataBase : ${dbData.database }</li>
		  <li class="list-group-item col-10">FrameWork : ${dbData.framework }</li>
		  <li class="list-group-item col-10"><a href="MainPage.jsp"><button type="button" class="btn btn-primary">확인</button></a></li>
		</ul>
		</div>
	<div class="col"></div>
	</div>
</div>
 
	
	<%@ include file="./template/footer.jspf" %>
</body>
</html>