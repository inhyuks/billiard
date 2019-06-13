<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String cp = request.getContextPath();
%>
<!DOCTYPE html>

<html>
  <head>
	<style>
		#div1{margin-left:20px; margin-top:90px;}
	</style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>대대전용 당구장</title>

    <!-- Bootstrap core CSS -->
   <link href="<%=cp%>/resources/bootstrap/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="<%=cp%>/resources/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">


  </head>

<body id="page-top" >
<div  id=div1 style="background-color: #FF0000;">
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav"
    style="background-color:gray;
    ">
    <div class="col-auto mr-auto">
    	<a class="navbar-brand js-scroll-trigger" href="/index.jsp">home</a>
    </div>
   	<div class="col-auto">
		<span>
				<input type="button" class="btn btn-primary btn-sm" value="로그인" onClick="location.href='/login/login.jsp'">
				<input type="button" class="btn btn-primary btn-sm" value="회원가입" onClick="location.href='/login/regist.jsp'">
		</span>
 
	</div>
      <div class="col-auto">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <i class="fas fa-bars"></i>
        </button>
        <span class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#about">쪽지함</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="/member/mydata.jsp">내정보</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#signup">즐겨찾기</a>
            </li>
          </ul>
          
        </span>  
   		    
      </div>
    </nav>
</div>
</body>

</html>