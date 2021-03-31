<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div class="container">
	<form method="post">
	<div class="row">
	<div class="col"></div>
	<div class="col-7">
	  <div class="form-group">
	    <label >반</label>
	    <input type="text" class="form-control" name="group">
	  </div>
	  <div class="form-group">
	    <label >학생명</label>
	    <input type="text" class="form-control" name="stuname">
	  </div>
	  <div class="form-group">
	    <label >java</label>
	    <input type="text" class="form-control" name="java">
	  </div>
	  <div class="form-group">
	    <label >database</label>
	    <input type="text" class="form-control" name="database">
	  </div>
	  <div class="form-group">
	    <label >framework</label>
	    <input type="text" class="form-control" name="framework">
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
	<div class="col"></div>
	</div>
</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>