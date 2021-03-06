<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>로그인</title>
<jsp:include page="header.jsp" />
</head>
<script>
/* 	function idsearch() {
		var url = "../member/idsearch.jsp";
		window.open(url, "", "width=500, height=200");
	}
	function pwsearch() {
		var url = "../member/pwsearch.jsp";
		window.open(url, "", "width=500, height=200");
	} */
</script>
<body>

	<div class="container" align="center">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
					<h3 style="text-align: center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
							name="id" id="id" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
							name="pw" id="pw" maxlength="20">
					</div>
					<button id="login_bt" class="btn btn-primary form-control">로그인</button>
				<!-- 	<div class="form-group">
						<input type="button" class="btn btn-primary form-control"
							value="아이디찾기" onclick="idsearch()"> 
						<input type="button"
							class="btn btn-primary form-control" value="비밀번호찾기"
							onclick="pwsearch()">
					</div> -->
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
	
	<script
		src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script>
 	$(document).ready(function() {
			$("#login_bt").click(function() { // 로그인 처리
				 var json = {
					id : $("#id").val(),
					pw : $("#pw").val()
				};
				for ( var str in json) { // 입력하지 않은 값이 있는경우
					if (json[str].length == 0) {
						alert($("#" + str).attr("placeholder") + "를 입력해주세요.");
						$("#" + str).focus();
						return;
					}
				}
				$.ajax({
					type : "post",
					url : "login",
					data : json,
					success : function(data) {
						 if(data==1){
							alert("로그인되었습니다.");
							location.replace = "/home";
						}
						else if(data==-1){
							alert("등록된 아이디가 없습니다.");
							location.replace = "/login";
						}
						else{
							alert("비밀번호가 일치하지 않습니다.");
							location.replace = "/login";
						} 
					}
				}); // login_bt ajax
			}); // login_bt 이벤트
		}); // document ready
	</script>
</body>
</html>



