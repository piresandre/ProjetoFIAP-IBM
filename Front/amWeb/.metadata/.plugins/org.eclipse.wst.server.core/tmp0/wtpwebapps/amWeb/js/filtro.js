  $(function(){ 

	  $("#filtro").keyup(function(){
	    var texto = $(this).val();
	    
	    $(".col-md-6").each(function(){
	      var resultado = $(this).text().toUpperCase().indexOf(' '+texto.toUpperCase());
	      
	      if(resultado < 0) {
	        $(this).fadeOut();
	      }else {
	        $(this).fadeIn();
	      }
	    }); 

	  });

	});