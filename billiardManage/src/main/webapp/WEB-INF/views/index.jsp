<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<div  class="container">
    <!-- Header -->
    <header class="masthead">
  <%--   <jsp:include page="header.jsp"/>  헤더--%>
      <div class="container d-flex h-100 alig
      -items-center">
        <div class="mx-auto text-center">
        	<br><br>
          <h1 class="mx-auto my-0 text-uppercase">대대전용 당구장 사이트</h1>
          <br><br><br>

		
          <a href="#" class="btn btn-primary js-scroll-trigger">당구장 찾기</a>
         <%	if (session.getAttribute("id") != null) {
         		if(session.getAttribute("permit") == null){%>
         		<%}
         		else{%>
         			 <a href="#" class="btn btn-primary js-scroll-trigger">내 당구장 관리</a>
				<%}
			}%>
 
            
          
        </div>
        
      </div>
      <br><Br>
    </header>
<body>
     <!-- About Section -->
<%--          로그인정보확인
		<%	if (session.getAttribute("id") == null) {%>
         		  <jsp:include page="no_index.jsp"/>
		<%} else {%>
				  <jsp:include page="lo_index.jsp"/>
		<%} %>    
		--%>
 
   


    <!-- Contact Section -->
     <section class="contact-section bg-black">
      <div class="container">
        <div class="row">
          <div class="col-md-4 mb-3 mb-md-0">
            <div class="card py-4 h-100">
              <div class="card-body text-center">
                <i class="fas fa-map-marked-alt text-primary mb-2"></i>
                <h4 class="text-uppercase m-0">Address</h4>
                <hr class="my-4">
                <div class="small text-black-50">대진대 컴퓨터공학과</div>
              </div>
            </div>
          </div>

          <div class="col-md-4 mb-3 mb-md-0">
            <div class="card py-4 h-100">
              <div class="card-body text-center">
                <i class="fas fa-envelope text-primary mb-2"></i>
                <h4 class="text-uppercase m-0">Email</h4>
                <hr class="my-4">
                <div class="small text-black-50">
                  <a href="#">sih2341@naver.com</a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-md-4 mb-3 mb-md-0">
            <div class="card py-4 h-100">
              <div class="card-body text-center">
                <i class="fas fa-mobile-alt text-primary mb-2"></i>
                <h4 class="text-uppercase m-0">Phone</h4>
                <hr class="my-4">
                <div class="small text-black-50">010-8775-xxxx</div>
              </div>
            </div>
          </div>
        </div>

        <div class="social d-flex justify-content-center">
          <a href="#" class="mx-2">
            <i class="fab fa-twitter"></i>
          </a>
          <a href="#" class="mx-2">
            <i class="fab fa-facebook-f"></i>
          </a>
          <a href="#" class="mx-2">
            <i class="fab fa-github"></i>
          </a>
        </div>

      </div>
    </section>

    <!-- Footer -->
    <footer class="bg-black small text-center text-black-50">
      <div class="container">
        Copyright &copy; Your Website 2018
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="/res/bootstrap/vendor/jquery/jquery.min.js"></script>
    <script src="/res/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="/res/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="/res/bootstrap/js/grayscale.min.js"></script>

  </body>
</div>
</html>
