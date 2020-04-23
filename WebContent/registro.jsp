<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="registroServlet" method="post">
		<ul>
			<li><label for="name">Usuario:</label> <input type="text"
				id="usuario" name="usuario"></li>
			<li><label for="mail" >Clave</label> <input type="password" id="mail"
				name="clave"></li>
			<li><label for="msg">Nombre:</label> <input type="text" id="msg"
					name="nombre"></input></li>
			<li><label for="msg">Direccion:</label> <input type="text" id="msg"
					name="direccion"></input></li>
			<li><label for="msg">Correo:</label> <input type="text" id="msg"
					name="correo"></input></li>
			<li><label for="msg">Telefono:</label> <input type="text" id="msg"
					name="telefono"></input></li>
			<li class="button">
				<button type="submit">Registrar</button>
			</li>
		</ul>
	</form>

</body>
</html>