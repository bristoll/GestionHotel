/**
 * 
 */

var prueba = document.getElementById("demo");

var btn = document.getElementById("btn");



//function pruebaFN() {
//
//	prueba.textContent = ${listaHotelesLibres};
//
//}

//function pruebaAjax(){
//	
//		  var listaLibres;
//		  var xhttp = new XMLHttpRequest();
//		  xhttp.onreadystatechange = function() {
//		    if (this.readyState == 4 && this.status == 200) {
//		      document.getElementById("demo").innerHTML = "ajax ejecutado correctamente";
//		      listaLibres=this.response;
//		      //console.log(listaLibres);
////		      var o = { "key1": [1,2,3], "key2": "value2"};
////		      for(var prop in o) {
////		        console.log(prop,o[prop]);  
////		      }
//		    var lista = JSON.parse(listaLibres);
//		    lista.forEach(function(element) {
//		    	  console.log(element);
//		    	}); 
//		  };
//		  xhttp.open("GET", "/clientes/listaLibres/3", true);
//		  //xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
//		  xhttp.send();
//		  }
//}
function pruebaAjax(){
	
	  var listaLibres;
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      document.getElementById("demo").innerHTML = "ajax ejecutado correctamente";
	      listaLibres=this.response;
	      console.log(listaLibres);
	      var lista = JSON.parse(listaLibres);
	      console.log(lista);
	      
	      for(var o in lista){
	    	  
	    	  console.log(o);
	    	  
	      }
	    }
	  };
	  xhttp.open("GET", "/clientes/listaLibres/3", true);
	  //xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	  xhttp.send();
	}