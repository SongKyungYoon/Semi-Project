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
	var size1,size2,size3;
	$(function(){
		$('.name').click(function(data){
			if($('.name').val()=="이름을 입력하세요")
				$('.name').val('');
		}).blur(function(){
			if($('.name').val()=="")
				$('.name').val("이름을 입력하세요");
		}).keyup(function(data){
			if($('.name').val().length>3){
				$('.name').val($('.name').val().substring(0,3));
			}
			if(!isNaN($(data).prop('key'))){
				if($(data).prop('key')!='Backspace'){
					alert("숫자 및 특수문자는 사용할 수 없습니다.");
					$('.name').val("").focus();
				}
			}
		});
		
		size1=$('.number').first().val('010');
		$('.number').first().keyup(function(data){
			//console.log($('.number').first().val().length);
			size1=$('.number').first().val().length;
			if(size1>=3){
				$('.number').first().val($('.number').first().val().substring(0,3))
				.next().focus();
			}
			if(isNaN($(data).prop('key')) && $('.number').first().val()!=''){
				if($(data).prop('key')!='Backspace'){
					alert("숫자만 입력 가능합니다");
					$('.number').first().val('').focus();
				}
			}
		}).blur(function(){
			if($('.number').first().val()==''){
				$('.number').first().val('010');
			}
		});
		
		size2=$('.number').first().next().val().length;
		$('.number').first().next().keyup(function(data){
			var size2=$('.number').first().next().val().length;
			if(size2>=4){
				$('.number').first().next().val($('.number').first().next().val().substring(0,4))
				.next().focus();
			}
			if(isNaN($(data).prop('key')) && $('.number').first().next().val()!=''){
				if($(data).prop('key')!='Backspace'){
					alert("숫자만 입력 가능합니다");
					$('.number').first().next().val("").focus();
				}
			}
		});
		
		size3=$('.number').first().next().next().val().length;
		$('.number').first().next().next().keyup(function(data){
			var size2=$('.number').first().next().next().val().length;
			if(size2>=4){
				$('.number').first().next().next().val($('.number').first().next().next().val().substring(0,4));
				$('.email').focus();
			}
			if(isNaN($(data).prop('key')) && $('.number').first().next().val()!=''){
				if($(data).prop('key')!='Backspace'){
					alert("숫자만 입력 가능합니다");
					$('.number').first().next().next().val("").focus();
				}
				
			}
		});
		
		$('.email').focus(function(){
			if($('.email').val()=="이메일을 입력하세요"){
				$('.email').val('');
				}
		}).click(function(e){
			if($('.email').val()=="이메일을 입력하세요"){
			$('.email').val('');
			}
		}).blur(function(){
			if($('.email').val()==''){
				$('.email').val("이메일을 입력하세요");
				}
		});
		
		$('form').submit(function(){
			if($('.name').val().length<2 || $('.name').val()=="이름을 입력하세요"){
				alert('이름을 확인해주세요');
			}else if(
				$('.number').first().val().length<2
				|| 	$('.number').first().next().val().length<3
				|| 	$('.number').first().next().next().val().length<4
			){
				alert('연락처를 확인해주세요');
			}else{
				$.ajax({
					url:"insertsugang.bit",
					type:"POST",
					data:$('form').serialize(),
					success:function(){
						console.log($('form').serialize());
						alert('수강신청이 완료되었습니다.');
						$('.name').val('이름을 입력하세요');
						$('.number').first().val('010');
						$('.number').first().next().val('');
						$('.number').first().next().next().val('');
						$('.email').val("");
					},
					
				});
			}
			return false;
		});
		
		function getParameterByName(name) {
		    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
		    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
		        results = regex.exec(location.search);
		    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
		}
		$(".delete").click(function(){
			$.ajax({
				url:"currdelete.bit",
				type:"POST",
				data:{num:getParameterByName('num')},
				success:function(){
					alert('삭제가 완료되었습니다.');
					location.href="currlist.bit";
				},
				
			});
		});
	});
</script>
</head>
<body>
<%@ include file="./template/header.jspf" %>
<c:set var="bean" value="${currDetail }"></c:set>
	<table>
		<tbody>
			<tr><td>${bean.sub }</td></tr>
			<tr><td>개강일		│${bean.open }</td></tr>
			<tr><td>교육기간	│${bean.period }</td></tr>
			<tr><td>지원자격	│${bean.qual }</td></tr>
		</tbody>
	</table>
	<label>${bean.content }</label>
	
	<form action="#" method="post">
		<input type="hidden" value="${bean.sub }" name="sub"/>
		<div>
			<label for="name">이름</label>
			<input type="text" name="name" value="이름을 입력하세요" class="name"/>
		</div>
		<div>
			<label for="date">생년월일</label>
			<input type="date" name="date" value="2000-01-01"/>
		</div>
		<div>
			<label>연락처</label>
			<input type="text" class="number" name="number1"/> 
			<input type="text" class="number" name="number2"/> 
			<input type="text" class="number" name="number3"/> 
		</div>
		<div>
			<label>이메일</label>
			<input type="email" class="email" name="email" value="이메일을 입력하세요"/> 
		</div>
		<div>
			<button type="submit">수강신청하기</button>
		</div>
	</form>
	<div>
		<c:if test="${ not empty ID}" >
		<c:if test="${POSITION =='영업' }">
		<button type="button" class="delete">게시물 삭제</button>
		</c:if>
		</c:if>
	</div>
	<%@ include file="./template/footer.jspf" %>
</body>
</html>