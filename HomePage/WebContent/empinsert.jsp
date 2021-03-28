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
			<div class="input-group flex-nowrap">
				<label class="input-group-text">회사</label>
				<input type="text" class="form-control" name="coname"/>
			</div>
			<div class="form-row input-group flex-nowrap">
				<div class="col input-group flex-nowrap">
					<label class="input-group-text">포지션</label>
					<input type="text" class="form-control" name="coposition"/>
				</div>
				<div class="col input-group flex-nowrap">
					<label class="input-group-text">마감일</label>
					<input type="date" class="form-control" name="deadline"/>
				</div>
			</div>
			<textarea name="content" id="editor1" rows="10" cols="80">
	                내용을 입력하세요.
	        </textarea>
	        <div>
	        	<button type="button" class="btn btn-primary btn-lg btn-block">입       력</button>
	        </div>
		</form>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>