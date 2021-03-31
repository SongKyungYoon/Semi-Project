<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script type="text/javascript">

</script>
</head>
<body>
<%@ include file="./template/header.jspf" %>
<div class="container">
  <div class="row">
    <div class="col-sm">
      <h2>${sessionScope.name }님 로그인</h2>
	  <div class="col-sm">
	  <h5><small>ID: ${sessionScope.id}</small></h5>
	  <h5><small>소속: ${sessionScope.position}</small></h5>
	  </div>
    </div>
    <div class="col-sm">
	    <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
		 <a href="LoginController?logout=logout"><button type="button" class="btn btn-secondary">Log-Out</button></a>
		 <a href="RollCall"><button type="button" class="btn btn-secondary">출석체크</button></a>
		    <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		      MySelect
		    </button>
		    <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
		      <a class="dropdown-item" href="currlist.bit">강의확인</a>
			    <c:if test="${sessionScope.position eq '학생' }">
			   		<a class="dropdown-item" href="SeongJeogController">성적확인</a>
			    </c:if>
			    <c:if test="${sessionScope.position eq '강사' }">
			    	<a class="dropdown-item" href="gradeinsert.jsp">성적기입</a>
			    </c:if>
			    <c:if test="${sessionScope.position eq '학생' }">
				    <a class="dropdown-item" href="NoticeBoardController">면접신청</a>
				    <a class="dropdown-item" href="currdetail.jsp">수강신청</a>
			    </c:if>
			    <c:if test="${sessionScope.position eq '강사' || sessionScope.position eq '행정'}">
			   		<a class="dropdown-item" href="classlist.bit">반 리스트</a>
			    </c:if>
			    <c:if test="${sessionScope.position eq '행정' }">
			    	<a class="dropdown-item" href="listsugang.bit">수강 리스트</a>
			    </c:if>
		  </div>
		</div>
	</div>
  </div>
</div>

  <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
  
  

<%@ include file="./template/footer.jspf" %>
</body>
</html>