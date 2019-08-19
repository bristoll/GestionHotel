<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div class="form-group col-md-5">
				
		


<c:set var="path" value="${ruta}"/>

			<c:choose>
				<c:when test="${path == 'add'}">
					<form action="/admin/addHoteles" method="post">
				</c:when>
			</c:choose>

					<div class="form-group">
						<label for="exampleInputID">ID</label> <input type="text"
							class="form-control" ="exampleInputID"
							aria-describedby="idHelp" placeholder="Enter ID" name="id" />

					</div>

					<div class="form-group">
						<label for="exampleInputNombre">Nombre</label> <input type="text"
							class="form-control" ="exampleInputNombre"
							aria-describedby="emailHelp" placeholder="Enter Nombre"
							name="nombre" />

					</div>

					<div class="form-group">
						<label for="exampleInputCategoria">Categoria</label> <input
							type="text" class="form-control" ="exampleInputCategoria"
							aria-describedby="categoriaHelp" placeholder="Enter Categoria"
							name="categoria" />

					</div>

					<div class="form-group">
						<label for="exampleInputZona1">Zona</label> <input type="zona"
							class="form-control" ="exampleInputZona1"
							aria-describedby="zonaHelp" placeholder="Enter zona"
							name="zona" />

					</div>

					<div class="form-group">
						<label for="exampleInputDir">Dir</label> <input type="text"
							class="form-control" ="exampleInputDir"
							aria-describedby="dirHelp" placeholder="Enter dir" name="dir" />

					</div>

					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
		</div>
	</div>

</body>
</html>