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
	<form method="POST">
		<div>
			<label>제목</label>
			<input type="text" name="sub"/>
		</div>
		<div>
			<label>개강일</label>
			<input type="date" name="open"/>
		</div>
		<div>
			<label>교육기간</label>
			<input type="text" name="period"/>
		</div>
		<div>
			<label>지원자격</label>
			<input type="text" name="qual"/>
		</div>
		<textarea name="content" id="editor1" rows="10" cols="80">
                내용을 입력하세요.
        </textarea>
        <div>
        	<button>입력</button>
        </div>
	</form>
</body>
</html>