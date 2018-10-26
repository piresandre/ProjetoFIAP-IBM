<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
	<%--   tentativa de direcionar para autentificação todas vez que fizer login porémm o sendredirect não link uma Servlet, tentei com private, do get, do post en não funciona <% if (session.getAttribute("email")!=null){
		//response.sendRedirect("/Autentificacao");
	}
		%> 
		
		--%> 
	

  <div class="main-navigation navbar-fixed-top">
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			  </button>
          <a class="navbar-brand" href="index.jsp"><img src="img/portfolio/imglogo.png"style="width:105px;"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="index.jsp">Home</a></li>
            <li class="active"><a href="#banner">Login</a></li>

          </ul>
        </div>
      </div>
    </nav>
  </div>
  <!--começo contact-->
  <div id="login" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="page-title text-center">
          <h1>Login </h1>
          <hr class="pg-titl-bdr-btm"></hr>
        </div>
        <form action="login" method="post" role="form" class="contactForm">
          <div class="form-sec">
            <div class="col-md-6 form-group">
              <input type="email" class="form-control text-field-box" name="email" id="email" placeholder="Seu e-mail" data-rule="email" data-msg="Por Favor valide seu e-mail" />
              <div class="validation"></div>
            </div>
            <div class="col-md-6 form-group">
              <input type="password" class="form-control text-field-box" name="senha" id="subject" placeholder="Senha" data-rule="minlen:4" data-msg="Por Favor coloque pelo menos 8 caracteres" />
              <div class="validation"></div>
            </div>
            <div class="botoes">
              <button class="button-medium" id="contact-submit" type="submit" name="contact">Entrar</button>&nbsp;
          <!--<button class="button-medium" id="cadastrar" type="submit" name="cadastrar"><a href="index.html#contact"> Cadastrar</a></button> -->
             <a href="index.jsp#contact" class="button-medium" id="cadastrar" type="submit" name="cadastrar"> Cadastrar</button></a> 
            </div>
           
          </div>
        </form>
      </div>
    </div>
  </div>
  <!--fim contact-->
  
<!--<form action="login" method="post">  APENAS CRIADO PARA TESTE

		Usuario: <input type="text" name="email">
		Senha: <input type="text" name="senha">
		<input type="submit" value="login">
		
</form> -->


<a href="/WEB-INF/paginas/meusCursos.jsp"> teste página</a>

  <!--comeco footer-->
  <footer class="footer section-padding">
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
  <!--fim footer-->
  <div class="footer-bottom">
    <div class="container">
      <div style="visibility: visible; animation-name: zoomIn;" class="col-md-12 text-center wow zoomIn">
        <div class="footer_copyright" id="copy">
          <p>©Study[BOT] todos os direitos reservados,2018.</p>
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
  <!--   <script src="contactform/contactform.js"></script> -->

</body>

</html>
