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

	<div class="container">
		<h2>FORM</h2>
		<form action="/action_page.php">
			<div class="form-group">
				<label for="hotel">Hotel </label> <select name="hotel">
					<option value="vacio">Vacio</option>
				</select>
			</div>

			<div class="form-group">
				<label for="precio">Precio </label> <input type="range"
					name="precio" min="0" max="500">
			</div>

			<div class="form-group">
				<label for="zona">Zona </label> <input type="checkbox" name="centro"
					value="centro">Centro<br> <input type="checkbox"
					name="afueras" value="afueras">Afueras<br>
			</div>

			<div class="form-group">
				<label for="hotel">Hotel </label> <select name="hotel">
					<option value="vacio">Vacio</option>
				</select>
			</div>

			<div class="form-group">
				<label for="estrellas">Estrellas </label> <input type="range"
					name="estrella" min="0" max="5">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<script src="/content/static/filtro.js"></script>
</body>
</html>