<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>회원가입</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div class="container" align="center">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<h3 style="text-align: center;">대대전용 당구장 회원가입</h3>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="아이디" id="id"
						name="id" maxlength="20">
					<button type="button" id="idOverlapChk"
						class="btn btn-primary btn-sm" style="width: 100px; height: 28px;">중복확인</button>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="비밀번호"
						id="pw" name="pw" maxlength="20">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="비밀번호확인"
						id="pwchk" name="pwchk" onchange="pwchk()"> <label id="pwlabel">(*필수 항목)</label>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="이름" id="name"
						name="name" maxlength="20">
				</div>
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="닉네임(다른사용자에게 비공개)" id="nickname" name="nickname"
						maxlength="20">
					<button type="button" id="nickNameOverlapChk"
						class="btn btn-primary btn-sm" style="width: 100px; height: 28px;">중복확인</button>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="핸드폰번호"
						id="nTel" name="nTel" maxlength="20">
				</div>
				<div class="form-group">
					본인점수: <select name="avg" id="avg">
						<%
							for (int i = 1; i <= 50; i++) {
						%>
						<option value="<%=i%>">
							<%=i%>점
						</option>
						<%
							}
						%>
					</select>
				</div>
				<button id="regist_bt" class="btn btn-primary form-control">회원가입</button>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
	<script
		src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script>
	var overLapId = "false";
	var overLapNickname = "false";
	function pwchk() { // 패스워드 일치확인
		if ($("#pw").val().length < 4
				|| $("#pw").val().length > 16) {
			alert("비밀번호는 4~16자리의 수만 가능합니다.");
			$("#pw").val("");
			$("#pwchk").val("");
			return false;
		}
		pw1 = $("#pw").val();
		pw2 = $("#pwchk").val();
		if (pw1 == pw2) {
			$("#pwlabel").text("확인");
		} else {
			$("#pwlabel").text("불일치");
			$("#pw").val("");
			$("#pwchk").val("");
		}
	}
	
		$(document).ready(function() {
			$("#idOverlapChk").click(function() {//아이디 유효성 검사
				var json = {
					id : $("#id").val(),
				};
				if (json.id.length < 4) {
					alert("아이디는 4자리이상 입니다.");
					return;
				}
				$.ajax({
					type : "post",
					url : "overlapChk",
					data : json,
					success : function(data) {
						if (data.chk == 0) {
							alert("사용하실수 있는 아이디 입니다.");
							$('#id').prop('readonly', true);
							overLapId = "true";
						} else
							alert("중복된 아이디입니다.");
					},
				});
			});

			$("#nickNameOverlapChk").click(function() {//닉네임 유효성 검사
				var json = {
					nickname : $("#nickname").val(),
				};
				if (json.nickname.length < 4) {
					alert("닉네임은 4자리이상 입니다.");
					return;
				}
				$.ajax({
					type : "post",
					url : "overlapChk",
					data : json,
					success : function(data) {
						if (data.chk == 0) {
							alert("사용하실수 있는 닉네임 입니다.");
							$('#nickname').prop('readonly', true);
							overLapNickname = "true";
						} else
							alert("중복된 닉네임 입니다.");
					},
				});
			});

			$("#regist_bt").click(function() { // 회원 가입 처리
				var json = {
					id : $("#id").val(),
					pw : $("#pw").val(),
					name : $("#name").val(),
					nickname : $("#nickname").val(),
					nTel : $("#nTel").val(),
					avg : $("#avg").val()
				};

				for ( var str in json) { // 입력하지 않은 값이 있는경우
					if (json[str].length == 0) {
						alert($("#" + str).attr("placeholder") + "를 입력해주세요.");
						$("#" + str).focus();
						return;
					}
				}
				if(overLapId=="false"){
						alert("ID중복체크를 해주세요.");
						return;
				}
				if(overLapNickname=="false"){
					alert("닉네임 중복체크를 해주세요.");
					return;
			}
				
				$.ajax({
					type : "post",
					url : "regist",
					data : json,
					success : function(data) {
						alert(data + "님 회원가입되었습니다.");
						location.replace = "/home";
					},
				});
			});
		});
	</script>
</body>
</html>