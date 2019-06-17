<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>회원가입</title>
<jsp:include page="header.jsp"/>
</head>
<body>

	
	 <div class="container" align="center">
           <div class="col-lg-4"></div>
           <div class="col-lg-4">         
              <div class="jumbotron" style="padding-top: 20px;">
             <form action="userpost" method="post">
                   <h3 style="text-align: center;">대대전용 당구장 회원가입</h3>
                   <div class="form-group">
                 	<input type="text" class="form-control" placeholder="아이디" name="id" maxlength="20">
                    <button type="button" class="btn btn-primary btn-sm" style="width:100px; height:28px;">중복확인</button>
                      </div>
                     <div class="form-group">
                    <input type="password" class="form-control" placeholder="비밀번호" name="pw" maxlength="20">
                      </div>
                      <div class="form-group">
                    <input type="password" class="form-control" placeholder="비밀번호확인" id="pwdchk">
                     <label id="label">(*필수 항목)</label>
                      </div>
                      <div class="form-group">
                    <input type="text" class="form-control" placeholder="이름" name="name" maxlength="20">
                      </div>
                      <div class="form-group">
                    <input type="text" class="form-control" placeholder="닉네임(다른사용자에게 비공개)" name="nickname" maxlength="20">
                    <button type="button" class="btn btn-primary btn-sm" style="width:100px; height:28px;">중복확인</button>
                      </div>
                      <div class="form-group">
                    <input type="text" class="form-control" placeholder="핸드폰번호" name="nTel" maxlength="20">
                      </div>
                      <div class="form-group">
                      본인점수:
                     <select name="avg" >
					<%for(int i=1;i<=50;i++){ %>
					<option value="<%=i%>"> <%=i %>점 </option>
					<%} %>
					</select>
                      </div>
                    
                     <input type="submit" class="btn btn-primary form-control" value="회원가입">
                 </form>
              </div>               
        </div>       
      <div class="col-lg-4"></div>
   </div> 
	
	
</body>
</html>