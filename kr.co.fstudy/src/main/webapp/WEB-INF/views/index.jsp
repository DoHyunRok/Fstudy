<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<meta charset="UTF-8">
<title>홈</title>
</head>
<body>
		
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="p-4 pt-5">
		  		<a href="#" class="img logo rounded-circle mb-5" style="background-image: url(images/logo.jpg);"></a>
	        <ul class="list-unstyled components mb-5">
	          <li class="active">
	           <a href="index.do"  aria-expanded="false">Home</a>
	          </li>
	          <li id="Java" onclick="getboard(this.id)">
	              <a href="#">Java</a>
	          </li>
	          <li id="Web" onclick="getboard(this.id)">
              <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Web</a>
              <ul class="collapse list-unstyled" id="pageSubmenu">
                <li>
                    <a id ="MVC1" onclick="getsubboard(this.id)">MVC1</a>
                </li>
                <li>
                    <a href="#">MVC2</a>
                </li>
                <li>
                    <a href="#">Spring</a>
                </li>
                <li>
                    <a href="#">MyBatis</a>
                </li>
              </ul>
	          </li>
	          <li>
              <a href="#">Python</a>
	          </li>
	          <li>
              <a href="#">BigData</a>
	          </li>
	        </ul>

	        <div class="footer">
	        	<p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib.com</a>
						  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
	        </div>

	      </div>
    	</nav>

        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="container-fluid">

            <button type="button" id="sidebarCollapse" class="btn btn-primary">
              <i class="fa fa-bars"></i>
              <span class="sr-only">Toggle Menu</span>
            </button>
            <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa fa-bars"></i>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="nav navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="register.do">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">FAQ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <h2 class="mb-4" id="h2">글목록</h2>
        <table id ="bbs">
			<tbody id="bbsbody">
				
			</tbody>      
        </table>
        <p id="index">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
      </div>
		</div>

    <script src="${pageContext.request.contextPath}/resources/css/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/popper.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/main.js"></script>
    <jsp:include page="boardajax.jsp"></jsp:include>
  </body>
</html>