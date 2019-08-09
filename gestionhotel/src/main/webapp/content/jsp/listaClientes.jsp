<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Clientes</title>
</head>
<body>

	<jsp:include page="nav.jsp" />

	<h1>Clientes</h1>

	<ul>
		<c:forEach var="cliente" items="${listaClientes}">
			<li><c:out value="${cliente.cli_nombre}" /></li>
		</c:forEach>
	</ul>

</body>
</html>