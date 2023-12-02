<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>


	<form  method="get" action="cursonovo">
		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="inputPassword4">Nome do Curso</label> <input type="text"
					class="form-control" id="nomecurso" placeholder="Curso">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Carga Horaria</label> <input type="text"
					class="form-control" id="cargahoraria" placeholder="Horarios">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Tipo do Curso</label> <input type="text"
					class="form-control" id="tipocurso" placeholder="Curso">
			</div>
		</div>

		<button type="submit" class="btn btn-primary">Entrar</button>
	</form>




</body>
</html>