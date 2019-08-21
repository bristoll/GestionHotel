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

<c:set var="hotel" value="${hotelesUpdate}" />

		<div class="form-group col-md-5">

			<form action="/admin/updateHoteles" method="post">
					
					<div class="form-group">
						<input type="hidden" class="form-control"
							id="exampleInputId" aria-describedby="idHelp"
							value="${hotel.ho_id}" name="id" />

					</div>
								
					<div class="form-group">
						<label for="exampleInputNombre">Nombre</label>
						<input type="text" class="form-control"
							id="exampleInputNombre" aria-describedby="nombreHelp"
							value="${hotel.ho_nombre}" name="nombre" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputCategoria">Categoria</label>
						<input type="text" class="form-control"
							id="exampleInputCategoria" aria-describedby="categoriaHelp"
							value="${hotel.ho_categoria}" name="categoria" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputZona1">Zona</label>
						<input type="text" class="form-control"
							id="exampleInputZona1" aria-describedby="zonaHelp"
							value="${hotel.ho_zona}" name="zona" />

					</div>
					
					<div class="form-group">
						<label for="exampleInputDir">Direccion</label>
						<input type="text" class="form-control"
							id="exampleInputDir" aria-describedby="dirHelp"
							value="${hotel.ho_direccion}" name="dir" />

					</div>
				

				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
		</div>
	</div>

</body>
</html>