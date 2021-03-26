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
	<form method="POST">
		<div>
			<label>반</label>
			<input type="text" name="group"/>
		</div>
		<div>
			<label>학생명</label>
			<input type="text" name="stuname"/>
		</div>
		<div>
			<label>java</label>
			<input type="text" name="java"/>
		</div>
		<div>
			<label>database</label>
			<input type="text" name="database"/>
		</div>
		<div>
			<label>framework</label>
			<input type="text" name="framework"/>
		</div>
        <div>
        	<button>입력</button>
        </div>
	</form>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>