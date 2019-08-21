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

function pruebaAjax(){
	
		  var listaLibres;
		  var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("demo").innerHTML = "ajax ejecutado correctamente";
		      listaLibres=this.response;
		      console.log(listaLibres);
		    }
		  };
		  xhttp.open("GET", "/clientes/listaLibres/3", true);
		  //xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		  xhttp.send();
		}
	
