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
  <!--Menu principal -->
  <div class="main-navigation navbar-fixed-top">
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			  </button>
          <a class="navbar-brand" href="index.html"><img src="img/portfolio/imglogo.png"style="width:105px;"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#banner">Home</a></li>
            <li><a href="#service">Especificac�es</a></li>
            <li><a href="#portfolio">Disciplinas</a></li>
            <li><a href="#contact">Cadastre-se</a></li>
            <li><a href=".footer_social">Contato</a></li>
            <li><a href="indexLogin.jsp">Login</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>

  <!--BANNER PRINCIPAL -->
  <div id="banner" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="jumbotron">
          <h1 class="small">Bem-vindo ao <span class="bold">STUDY[bot]</span></h1>
          <p class="big">Tudo o que voc� precisa pra ir bem nos seus estudos.</p>
        </div>
      </div>
    </div>
  </div>
  <!--BANNER END-->

  <!--TELA RESERVADA PARA O CHATBOT -->
  <div class="cta-1">
    <div class="container">
      <div class="row text-center white">
        <h1 class="cta-title">Diga ol� para o STUDY[bot]</h1>
        <p class="cta-sub-title">Estudar aquelas materias mais dificeis, ficou muito mais facil!!!</p>
      </div>
    </div>
  </div>
  <!--FINAL DA TELA RESERVADA PARA O CHAT BOT -->

  <!--TELA COM AS DISCIPLINAS -->
  <div id="service" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="page-title text-center">
          <h1>Nossas Disciplinas</h1>
          <p> </p>
          <hr class="pg-titl-bdr-btm"></hr>
        </div>
        <div class="col-md-4">
          <div class="service-box">
            <div class="service-icon"><i class="fa fa-desktop"></i></div>
            <div class="service-text">
              <h3>L�gica de programa��o</h3>
              <p> L�gica de Programa��o � a t�cnica de desenvolver algoritmos (sequ�ncias l�gicas) para atingir determinados objetivos dentro de certas regras baseadas na L�gica matem�tica e em outras teorias.</p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="service-box">
            <div class="service-icon"><i class="fa fa-television"></i></div>
            <div class="service-text">
              <h3>Banco de dados </h3>
              <p>Bancos de dados ou bases de dados s�o um conjunto de arquivos relacionados entre si com registros sobre pessoas, lugares ou coisas. S�o cole��es organizadas de dados que se relacionam de forma a criar algum sentido e dar mais efici�ncia durante uma pesquisa ou estudo.</p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="service-box">
            <div class="service-icon"><i class="fa fa-laptop"></i></div>
            <div class="service-text">
              <h3>Linguagens de programa��o </h3>
              <p>Diversas linguagens de programa��o surgiram desde ent�o. Entre estas incluem-se C#, VB.NET, Java, Object Pascal, Objective-C, PHP, Python, SuperCollider, linguagem D e Ruby.</p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="service-box">
            <div class="service-icon"><i class="fa fa-globe"></i></div>
            <div class="service-text">
              <h3>Programa��o WEB</h3>
              <p> Desenvolvimento web � o termo utilizado para descrever o desenvolvimento de sites, na Internet ou numa intranet. Este � o profissional que trabalha desenvolvendo websites, podendo ser um Web Designer (Desenvolvedor do Layout), ou Web Developer(Desenvolvedor de sistemas). O desenvolvimento refere-se a um processo de constru��o e testes do software especifico para a web, com a finalidade de se obter um conjunto de programas, que satisfazem as fun��es pretendidas, quer em termos de usabilidade dos usu�rios ou compatibilidade com outros programas existentes. O desenvolvimento web pode variar desde simples p�ginas est�ticas a aplica��es ricas, com�rcios eletr�nicos ou redes sociais.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--FIM DA TELA RESERVADA PARA AS DISCIPLINAS-->


  <div id="portfolio">
    <div class="container">
      <div class="page-title text-center">
        <h1>Conhe�a melhor os nossos cursos</h1>
        <hr class="pg-titl-bdr-btm"></hr>
      </div>


      <div class="row" id="portfolio-wrapper">
        <div class="col-lg-3 col-md-6 portfolio-item filter-app">
          <a href="cursos.jsp">
            <img src="img/portfolio/imgJava.jpg" alt="">
            <div class="details">
              <h4>Java</h4>
            </div>
          </a>
        </div>

        <div class="col-lg-3 col-md-6 portfolio-item filter-web">
          <a href="cursos.jsp">
            <img src="img/portfolio/dba.jpg" alt="">
            <div class="details">
              <h4>Banco de dados</h4>
            </div>
          </a>
        </div>

        <div class="col-lg-3 col-md-6 portfolio-item filter-app">
          <a href="cursos.jsp">
            <img src="img/portfolio/web3.jpg" alt="">
            <div class="details">
              <h4>Web</h4>
            </div>
          </a>
        </div>

        <div class="col-lg-3 col-md-6 portfolio-item filter-card">
          <a href="cursos.jsp">
            <img src="img/portfolio/tecnologia.jpg" alt="">
            <div class="details">
              <h4>L�gica de programa��o</h4>
            </div>
          </a>
        </div>
          </a>
        </div>
      </div>
    </div>
  </div>

  <!--come�o contato / cadastro -->
  <div id="contact" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="page-title text-center">
          <h1>Cadastre-se</h1>
          <p></p>
          <hr class="pg-titl-bdr-btm"></hr>
        </div>
        <div id="sendmessage">sua menssagem foi enviada.Obrigado</div>
        <div id="errormessage"></div>

        <div class="form-sec">
          
          <form action="cadastrarAluno" method="post" role="form" class="contactForm">
          	 <div class="col-md-4 form-group">
          	 <select class="form-control" id="descHistorico" nome="descHistorico">
          	     <option>EXCELENTE</option>
    			 <option>BOM</option>
   				 <option>MEDIO</option>
  			     <option>RUIM</option>
  			  </select>
          	 </div>
          	 <div class="col-md-4 form-group">
          	 <select class="form-control" id="grauEscolaridade" name="grauEscolaridade" placeholder="escolha uma Escolaridade" >
          	     <option>SUPERIOR</option>
   				 <option>FUNDAMENTAL 2</option>
  			     <option>FUNDAMENTAL 1</option>
  			  </select>
          	 </div>
          	 <div class="col-md-4 form-group">
              <input type="date"  name="dataFormacao" id="dataFormacao" placeholder="Data de forma��o"/>
              <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="text"  class="form-control text-field-box" name="nome" id="nome" placeholder="Seu nome" data-rule="minlen:4" data-msg="PorFavor coloque no minumo 4 caracteres" />
              <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="text"  class="form-control text-field-box" name="apelido" id="apelido" placeholder="Seu apelido" data-rule="minlen:4" data-msg="PorFavor coloque no minumo 4 caracteres" />
            <div class="validation"></div>
            </div>
           <div class="col-md-4 form-group">
              <input type="text"  class="form-control text-field-box" name="rg" id="rg" placeholder="Digite o rg" data-rule="minlen:4" data-msg="PorFavor coloque no minumo 4 caracteres" />
            <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="text"  class="form-control text-field-box" name="cpf" id="cpf" placeholder="Digite o cpf" data-rule="minlen:4" data-msg="PorFavor coloque no minumo 4 caracteres" />
            <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="date" name="dataNascimento" id="dataNascimento" placeholder="Digite a data de nascimento" />
            <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="email" class="form-control text-field-box" name="email" id="email" placeholder="Seu e-mail" data-rule="email"/>
              <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="email" class="form-control text-field-box" name="telefone" id="telefone" placeholder="Seu telefone" data-rule="email" data-msg="Por Favor valide seu e-mail" />
              <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
              <input type="email" class="form-control text-field-box" name="senha" id="senha" placeholder="Senha" data-rule="email" data-msg="Por Favor valide seu e-mail" />
              <div class="validation"></div>
            </div>
            <div class="col-md-4 form-group">
            <select class="form-control" id="sexo" nome="sexo">
          	     <option>MASCULINO</option>
    			 <option>FEMININO</option>
  			 </select>
          	 </div>
  		    <div class="col-md-4 form-group">
              <input type="email" class="form-control text-field-box" name="idade" id="idade" placeholder="Sua idade" data-rule="email" data-msg="Por Favor valide seu e-mail" />
              <div class="validation"></div>
            </div>
              <button class="button-medium" id="contact-submit" type="submit" name="cadastrar">Cadastre-se agora</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  <!--fim contato / cadastro-->

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
  <!-- rodap� direitos reservados -->
  <div class="footer-bottom">
    <div class="container">
      <div style="visibility: visible; animation-name: zoomIn;" class="col-md-12 text-center wow zoomIn">
        <div class="footer_copyright">
          <p>�Study[BOT] todos os direitos reservados,2018.</p>
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
  <!-- n�o funciona  <script src="contactform/contactform.js"></script> -->

</body>

</html>