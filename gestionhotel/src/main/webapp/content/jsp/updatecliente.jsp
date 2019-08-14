<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>
<body>

<div class="row justify-content-center">

<c:set var="cliente" value="${clienteUpdate}" />

		<div class="form-group col-md-5">

			<form action="/admin/update" method="post">
					
					<div class="form-group">
<!-- 						<label for="exampleInputNombre">DNI</label> -->
						<input type="hidden" class="form-control"
							id="exampleInputNombre" aria-describedby="emailHelp"
							value="${cliente.cli_dni}" name="dni" />

					</div>
								
					<div class="form-group">
						<label for="exampleInputNombre">Nombre</label>
						<input type="text" class="form-control"
							id="exampleInputNombre" aria-describedby="emailHelp"
							value="${cliente.cli_nombre}" name="nombre" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputApellido">Apellido</label>
						<input type="text" class="form-control"
							id="exampleInputNombre" aria-describedby="emailHelp"
							value="${cliente.cli_apellido}" name="apellido" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputEmail1">Email</label>
						<input type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							value="${cliente.cli_email}" name="email" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputDir">Dir</label>
						<input type="text" class="form-control"
							id="exampleInputDir" aria-describedby="emailHelp"
							value="${cliente.cli_direccion}" name="dir" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputCod">cod</label>
						<input type="text" class="form-control"
							id="exampleInputcod" aria-describedby="emailHelp"
							value="${cliente.cli_codigopos}"  name="cod" />

					</div>
					
					
					<div class="form-group">
						<label for="exampleInputciudad">ciudad</label>
						<input type="text" class="form-control"
							id="exampleInputciudad" aria-describedby="emailHelp"
							value="${cliente.cli_ciudad}"  name="ciudad" />

					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Contraseña</label>
						<input type="password" class="form-control"
							id="exampleInputPassword1" value="${cliente.password}" name="pass" />
					</div>

				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
		</div>
	</div>

</body>
</html>