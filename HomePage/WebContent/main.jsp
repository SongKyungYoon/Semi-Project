<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=EUC-KR">
<style type="text/css" rel="stylesheet">
	*{
		margin:0px;
		padding:0px;
	}
	nav{
		margin-top:30px;
	}
	.nav-item,.nav-item dropdown{
		margin-left:60px;
	}
	.nav-item{
	
		
	}
	.nav-item>a:hover{
		background-color:rgba(0,0,0,0.3);
		border-radius:10px;
		display:block;
	}
	.content{
		width:1152px;
		height:513px;
		overflow:hidden;
	}
	.content>ul{
		list-style:none;
		padding:0px;
	}
	.content>ul>li{
		
	}
	.content>ul>li>img{
		width:100%;
	}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script type="text/javascript" src="./js/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	setInterval(loop,2000);
	function loop(){
		$('.visualBox>li').first().appendTo('.visualBox');
	}
});

</script>
<title>메인</title>
</head>
<body>
<header>
	
</header>
<div class="container" style='width:1200px;'>
<div class="container-fluid">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="main.jsp">
				<div id="logo">
					<img src="imgs/blue_logo.png"/>
				</div>	
			</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link" href="map">찾아오는길</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="">창업지원센터</a>
					</li>
					
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
						게시판
						</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="board.jsp">질문 게시판</a><li>
							<li><a class="dropdown-item" href="">강의 게시판</a><li>
							<li><a class="dropdown-item" href="">성적 게시판</a><li>
						</ul>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="LoginPage.jsp">로그인</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="SignUpForm.jsp">회원가입</a>
					</li>
				</ul>
				
			</div>
	</nav>
	<div class="content">
		<ul class="visualBox">
			<li><img src="./imgs/visual1.jpg"/></li>
			<li><img src="./imgs/visual2.jpg"/></li>
			<li><img src="./imgs/visual3.jpg"/></li>
		</ul>
	</div>
	<footer>
	
	</footer>
	</div>
</div>
</body>
</html>
