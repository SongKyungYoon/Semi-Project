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
			<label class="input-group-text">제목</label>
			<input type="text" class="form-control" name="sub"/>
		</div>
		<div class="form-row input-group flex-nowrap">
			<div class="col input-group flex-nowrap">
				<label class="input-group-text">개강일</label>
				<input type="date" class="form-control" name="open"/>
			</div>
			<div class="col input-group flex-nowrap">
				<label class="input-group-text">교육기간</label>
				<input type="text" class="form-control" name="period"/>
			</div>
		</div>
		<div class="input-group flex-nowrap">
			<label class="input-group-text">지원자격</label>
			<input type="text" class="form-control" name="qual"/>
		</div>
		<textarea name="content" id="editor1" rows="10" cols="80">
                내용을 입력하세요.
        </textarea>
        <div>
        	<button type="button" class="btn btn-primary btn-lg btn-block">입력</button>
        </div>
	</form>
</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>