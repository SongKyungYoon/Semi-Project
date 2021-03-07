<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('.check').click(function(e){
			//console.log($(this).val());
			var val=$(this).val();
			var ox=$(this).val().substring($(this).val().length-1,$(this).val().length);
			var ox2;
			if(ox=='O'){
				ox2='X';
			}else{
				ox2='O';
			}
			$.ajax({
				url:"checksugang.bit",
				type:"POST", 
				data:val.substring(0,val.length-1)+ox2,
				success: function(){
					location.reload();
				}
			});
			return false;
		});
		
		$('.delete').click(function(e){
			var val=$(this).val();
			$.ajax({
				url:"deletesugang.bit",
				type:"post", 
				data:val,
				success: function(){
					location.reload();
				}
			});
			return false;
		});
		
	});
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>신청날짜</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>연락처</th>
				<th>이메일</th>
				<th>연락여부</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td>${bean.num }</td>
					<td>${bean.nalja }</td>
					<td>${bean.name }</td>
					<td>${bean.date }</td>
					<td>${bean.pnum }</td>
					<td>${bean.email }</td>
					<td>${bean.check }</td>
					<td>
						<button class="check" name="check" value="num=${bean.num }&check=${bean.check }">연락확인</button>
						<button class="delete" name="delete"value="num=${bean.num }">삭제</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>