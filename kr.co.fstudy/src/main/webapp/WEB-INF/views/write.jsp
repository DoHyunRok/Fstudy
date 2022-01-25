<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<meta charset="UTF-8">
<title></title>
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
	          <li>
	              <a href="#">About</a>
	          </li>
	          <li>
              <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Pages</a>
              <ul class="collapse list-unstyled" id="pageSubmenu">
                <li>
                    <a href="#">Page 1</a>
                </li>
                <li>
                    <a href="#">Page 2</a>
                </li>
                <li>
                    <a href="#">Page 3</a>
                </li>
              </ul>
	          </li>
	          <li>
              <a href="#">Portfolio</a>
	          </li>
	          <li>
              <a href="#">Contact</a>
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
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="register.do">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Portfolio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <h2 class="mb-4">글 작성</h2>
        <form action="write.do" method="post" onsubmit="return boardcheck();">
        <p><input type="text"  name="title" id="title" style=width:90%;></p>
        <p >
        	<select name="category" id="category" style =width:90%;text-align-last:center; onchange="selectsub(this)" >
        		<option value ="Java" selected>Java</option>
        		<option value ="Web" >Web</option>
        		<option value ="Spring">Spring</option>
        		<option value ="Python" >Java</option>
        		<option value ="Bigdata" >Bigdata</option>
       		</select>
       		<select name="categorysub" id="categorysub" style =width:90%;text-align-last:center; >
       			<option>선택해주세요.</option>
       		</select>
        </p>
        <p><input type="text" name="content" id="bbs" style = width:90%;height:900px;></p>
        <p><input type="submit"value ="글 작성" ></p>
        </form>
      </div>
		</div>

    <script src="${pageContext.request.contextPath}/resources/css/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/popper.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/js/main.js"></script>
    <jsp:include page="boardajax.jsp"></jsp:include>
  </body>
</html>