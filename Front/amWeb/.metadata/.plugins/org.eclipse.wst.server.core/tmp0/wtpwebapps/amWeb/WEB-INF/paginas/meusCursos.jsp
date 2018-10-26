<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class=" js no-touch">
	
	

<head>
  <title>STUDY|Plataforma de Estudos</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,600|Raleway:600,300|Josefin+Slab:400,700,600italic,600,400italic' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" type="text/css" href="css/slick-team-slider.css" />
  <link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<body>
	<% 
	
	if(session.getAttribute("email")==null)
		{
		response.sendRedirect("./indexLogin.jsp");
		}
	%>
  <div class="main-navigation navbar-fixed-top">    <!-- menu principal superior -->
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
          <a class="navbar-brand" href="./index.jsp"><img src="img/portfolio/imglogo.png"style="width:105px;"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="./index.jsp">Home</a></li>

            <li  class="active"><a href="#">Meus cursos</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>

  <div id="centro">
   	<div class="page-title text-center">
          <h1>Meus cursos</h1>
          <hr class="pg-titl-bdr-btm"></hr>
BEM VINDO ${email}  TESTE PARA UMA TELA DE CURSOS </span></h1>
	<form action="logout" method="post">
	<input type="submit" value="Logout">
	</form>
	</div>
 </div>


  </body>


  <footer class="footer section-padding">  <!-- footer siga-nos  -->
    <div class="container">
      <div class="row">
        <div style="visibility: visible; animation-name: zoomIn;" class="col-sm-12 text-center wow zoomIn">
          <h3>Siga-nos</h3>
          <div class="footer_social">
            <ul>
              <li><a class="f_facebook" href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a class="f_twitter" href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a class="f_google" href="#"><i class="fa fa-google-plus"></i></a></li>
              <li><a class="f_linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
            </ul>
          </div>
        </div>

      </div>

    </div>

  </footer>

    <div class="footer-bottom"> <!-- rodap� com direitos reservados -->
    <div class="container">
      <div style="visibility: visible; animation-name: zoomIn;" class="col-md-12 text-center wow zoomIn">
        <div class="footer_copyright">
          <p>� Study[BOT] todos os direitos reservados 2018.</p>
          <div class="credits">

          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="js/jquery.min.js"></script>
  <script src="js/jquery.easing.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script type="text/javascript" src="js/slick.min.js"></script>
  <script type="text/javascript" src="js/custom.js"></script>
  <script src="contactform/contactform.js"></script>

</body>

</html>
