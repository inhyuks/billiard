<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
				<form action="logincheck.jsp" method="post">
					<h3 style="text-align: center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
							name="id" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
							name="pw" maxlength="20">
					</div>

					<input type="submit" class="btn btn-primary form-control"
						value="로그인">
					<div class="form-group">
						<input type="button" class="btn btn-primary form-control"
							value="아이디찾기" onclick="idsearch()"> 
						<input type="button"
							class="btn btn-primary form-control" value="비밀번호찾기"
							onclick="pwsearch()">
					</div>
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
</body>
</html>



