/**
 * 
 */

var prueba = document.getElementById("demo");

var hotel = document.getElementById("hotel");

hotel.addEventListener("change", function() {
	var listaLibres;
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      listaLibres=this.response;
	      prueba.textContent = "FIN";	
	      //console.log(listaLibres);
	      //console.log(this.responseText);
	      
		    var lista = JSON.parse(listaLibres);
//		    for(var prop in lista) {
//		    	console.log(lista[prop]); 
//		    }
		    
		    console.log(lista[3]); 
		    
		    
		    for(var habitacion in lista[3]) {
		    	var sel = document.getElementById('habitaciones');
			    var opt = document.createElement('option');
			    opt.appendChild( document.createTextNode(lista[3][habitacion].ha_id) );
			    //opt.value = 'option value';
			    opt.value = lista[3][habitacion].ha_id;
			    sel.appendChild(opt);
		    }
		    
		    
	      
	      
	    }
	  };
	  xhttp.open("GET", "/clientes/listaHabLibres/3", true);
	  xhttp.send();
	
	
});



function pruebaFN() {

	prueba.textContent = "ALGO";
		

}

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
function rellenar(){
	
	  var listaLibres;
	  var xhttp = new XMLHttpRequest();
	  
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	   
	    	
	    var opcion = document.getElementById("hotel").value;
	    var select =document.getElementById("habitaciones");
	    var nuevo=document.createElement('option').appendChild(document.createTextNode('pacuco pacuquín')).value="prueba";
	    select.appendChild(nuevo);
	  };
	  xhttp.open("GET", "/clientes/listaHabLibres?numPersonas="+"3", true);
	  //xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	  xhttp.send();
	}
}

function peticion(){
	
	 var listaLibres;
	  var xhttp = new XMLHttpRequest();
	  console.log("evento");
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      listaLibres=this.response;
	      console.log("dentro");
	      
	      console.log(listaLibres);
//	    var lista = JSON.parse(listaLibres);
//	    lista.forEach(function(element) {
//	    	  console.log(element);
//	    	}); 
	  };
	  xhttp.open("GET", "/clientes/listaHabLibres/3", true);

	  xhttp.send();
	  }
	
}

