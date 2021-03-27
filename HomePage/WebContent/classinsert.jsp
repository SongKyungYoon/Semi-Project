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
		<form method="POST">
			<div>
				<label>반</label>
				<input type="text" name="group"/>
			</div>
			<div>
				<label>강사</label>
				<input type="text" name="gangsa"/>
			</div>
			<div>
				<label>기간</label>
				<input type="text" name="period"/>
			</div>
	        <div>
	        	<button>입력</button>
	        </div>
		</form>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>