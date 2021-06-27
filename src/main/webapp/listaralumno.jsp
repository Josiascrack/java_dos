<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="recursos/faw/web-fonts-with-css/css/fontawesome-all.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" />
<link rel="stylesheet" href="recursos/css/rol.css" />
<body background="https://www.wallpapertip.com/wmimgs/40-405602_white-hd-wallpaper-for-pc.jpg">
	<div class="container small" style="margin-bottom: 40px">
		<div class="form-group">
			<label for="a" >Alumno</label> 
			<input type="text" class="form-control"	id="nombre" /> 
			<input type="hidden" class="form-control"	id="id" value="0" />
		</div>
		<div class="form-group">
			<label for="a">Telefono</label> 
			<input type="text" class="form-control"	id="telefono" /> 
			
		</div>
		<div class="form-group">
			<label for="a">Direccion</label> 
			<input type="text" class="form-control"	id="direccion" /> 
			
		</div>
		<button class="btn btn-success" id="boton2">Crear</button>
	</div>
	<div class="container small">
		<table class="table" id="tablita">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">IDAlum</th>
					<th scope="col">Nombre</th>
					<th scope="col">Telefono</th>
					<th scope="col">Direccion</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>
<script src="recursos/js/jquery.js"></script>
<script src="recursos/js/bootstrap.min.js"></script>
<script type="text/javascript" src="recursos/js/listalumno.js"></script>
</body>
</html>