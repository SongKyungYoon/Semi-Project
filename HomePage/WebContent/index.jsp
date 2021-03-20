<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
<%@ include file="./template/header.jspf" %>
		<!-- content 시작 -->
		<div class="content">
			<!-- mainVisual 시작 -->
			<div id="demo" class="carousel slide" data-ride="carousel" >
		
				<!-- 밑에 슬라이드 버튼 -->
				<ul class="carousel-indicators">
					<li data-target="#demo" data-slide-to="0" class="active"></li>
					<li data-target="#demo" data-slide-to="1"></li>
					<li data-target="#demo" data-slide-to="2"></li>
				</ul>
				  
				<!-- 슬라이드 할 이미지 -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="./imgs/visual1.jpg" alt="Los Angeles" width="800" height="300">
					</div>
					<div class="carousel-item">
						<img src="./imgs/visual2.jpg" alt="Chicago" width="800" height="300">
					</div>
					<div class="carousel-item">
						<img src="./imgs/visual3.jpg" alt="New York" width="800" height="300">
					</div>
				</div>
				  
				<!-- 컨트롤 버튼 -->
				<a class="carousel-control-prev" href="#demo" data-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</a>
				<a class="carousel-control-next" href="#demo" data-slide="next">
					<span class="carousel-control-next-icon"></span>
				</a>
				
			</div>
		</div>
		<!-- mainVisual 끝 -->
		<!-- subVisual 시작 -->
		<div class="row" >
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class6.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class2.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class4.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
		</div>
			<div class="row">
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class3.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class5.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
			<div class="col-sm cl1">
				<div class="boxdeco">
					<a href="#"><img src="./imgs/class1.png"></a>
					<ul class="textbox">
						<li><strong>자바 기초 특강</strong></li>
						<li><small><span class="text-danger "><strong>개강일</strong></span>&nbsp;| 2019-02-16</small></li>
						<li><small>교육기간 &nbsp;| 2019-02-16 ~ 2025-02-15</small></li>
					</ul>
				</div>	
			</div>
			<!-- subVisual 끝 -->
		</div>
		<!-- mainVisual 끝 -->
		
	
<%@ include file="./template/footer.jspf" %>


</body>
</html>