<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- datatables inicio -->
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/jq-3.3.1/jszip-2.5.0/dt-1.10.21/b-1.6.2/b-flash-1.6.2/b-html5-1.6.2/b-print-1.6.2/datatables.min.css"/>
<!-- datatables fin -->
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Dashboard - Administrador</title>
<link href="css/styles.css" rel="stylesheet" />
<link
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" crossorigin="anonymous" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js"
	crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
	<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
		<a class="navbar-brand">Edificio Think</a>
		<button class="btn btn-link btn-sm order-1 order-lg-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>
		<!-- Navbar Search-->
		<form action="/mantenedorResidentes" method="post"
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0"></form>
		<!-- Navbar-->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="userDropdown" href="#"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<a class="dropdown-item" href='<c:out value="/home" />'>Home</a>
					<a class="dropdown-item" href='<c:out value="/login" />'>Salir Sistema</a>
				</div></li>
		</ul>
	</nav>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-dark"
				id="sidenavAccordion">
				<div class="sb-sidenav-menu">
					<div class="nav">
						<div class="sb-sidenav-menu-heading">Mantenedor Universal</div>
						<a class="nav-link collapsed" href="#" data-toggle="collapse"
							data-target="#collapseLayouts" aria-expanded="false"
							aria-controls="collapseLayouts">
							<div class="sb-nav-link-icon">
								<i class="fas fa-columns"></i>
							</div> Administracion
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="collapseLayouts"
							aria-labelledby="headingOne" data-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href='<c:out value="/mantenedorResidentes" />'>Residentes</a>
								<a class="nav-link" href='<c:out value="/mantenedorEmpleados" />'>Empleados</a>
							</nav>
						</div>
                            <div class="sb-sidenav-menu-heading">Noticias</div>
                            <a class="nav-link" href="https://www.facebook.com/">
                                <div class="sb-nav-link-icon"><i class="fab fa-facebook-f"></i></div>
                                Facebook
                            </a>
                            <a class="nav-link" href="https://www.gob.cl/coronavirus/cifrasoficiales/">
                                <div class="sb-nav-link-icon"><i class="far fa-newspaper"></i></i></div>
                                Noticias COVID
                            </a>
					</div>
				</div>
				<div class="sb-sidenav-footer">
					<div class="small">Autenticado como:</div>
					<c:out value = "${username}"></c:out>
				</div>
			</nav>
		</div>
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid">
					<h1 class="mt-4">Maestro de Residentes</h1>

					<div class="card mb-4">
						<div class="card-header">
							<i class="fas fa-table mr-1"></i> Mantenedor Residentes
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<form class="needs-validation" novalidate>
									<div class="form-row">
										<div class="col-md-3 mb-3">
											<label for="nombre">Nombre</label> <input
												type="text" class="form-control" id="nombre" name="nombre"
												placeholder="nombre" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="apellido">Apellido</label> <input
												type="text" class="form-control" id="apellido" name="apellido"
												placeholder="apellido" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="rut">Rut</label> <input
												type="text" class="form-control" id="rut" name="rut"
												placeholder="rut" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="telefono">Telefono</label> <input
												type="text" class="form-control" id="telefono" name="telefono"
												placeholder="telefono" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="correo">Correo</label> <input
												type="text" class="form-control" id="correo" name="correo"
												placeholder="correo" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="contrasenia">Contraseña</label> <input
												type="text" class="form-control" id="contrasenia" name="contrasenia"
												placeholder="contrasenia" value="" required>
											<div class="valid-feedback">Looks good!</div>
										</div>
										<div class="form-group col-md-2">
										      <label for="rol">Rol</label>
										      <select id="rol" class="form-control">
										        <option selected>Seleccione...</option>
										        <option>Residente</option>
										      </select>
										    </div>
										    <div class="form-group col-md-1">
										      <label for="departamento">Departamento</label>
										      <c:forEach var="departamento" items="${departamento}">
										      	<select id="departamento" class="form-control">
										       		<option selected>Seleccione...</option>
										        	<option>${departamento.numero}</option>
										        </select>
										      </c:forEach>
										    </div>
									</div>
									<div class="form-group">
										<div class="form-check">
											<button class="btn btn-primary" type="submit">Grabar</button>
										</div>
									</div>

								</form>
								<table class="table" id="dataTable" width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre</th>
											<th>Apellido</th>
											<th>Rut</th>
											<th>Telefono</th>
											<th>Correo</th>
											<th>Depto</th>
											<th>Accion</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th>ID</th>
											<th>Nombre</th>
											<th>Apellido</th>
											<th>Rut</th>
											<th>Telefono</th>
											<th>Correo</th>
											<th>Depto</th>
											<th>Accion</th>
										</tr>
									</tfoot>
									<tbody>
									<c:forEach var="residentes" items="${residentes}">
										<tr>
											<td>${residentes.id}</td>
											<td>${residentes.nombre}</td>
											<td>${residentes.apellido}</td>
											<td>${residentes.rut}</td>
											<td>${residentes.telefono}</td>
											<td>${residentes.correo}</td>
											<td>${residentes.departamento.numero}</td>
											<td>
												<div class="btn-group" role="group" aria-label="Basic example">
												  <button type="button" class="btn btn-primary">Actualizar</button>
												  <button type="button" class="btn btn-primary">Eliminar</button>

												</div>
											</td>
										</tr>
									</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</main>
			<footer class="py-4 bg-light mt-auto">
				<div class="container-fluid">
					<div
						class="d-flex align-items-center justify-content-between small">
						<div class="text-muted">Copyright &copy; Building Admin 2020</div>
						<div>
							<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
								&amp; Conditions</a>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
	<script src="js/scripts.js"></script>
		<!-- bootstrap json slim inicio-->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
	<!-- bootstrap json slim fin-->
		<!-- datatables json completo inicio -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/v/dt/jq-3.3.1/jszip-2.5.0/dt-1.10.21/b-1.6.2/b-flash-1.6.2/b-html5-1.6.2/b-print-1.6.2/datatables.min.js"></script>
	<!-- datatables json completo fin -->
	
	<script type="text/javascript">
		const cdn = "http://cdn.datatables.net/plug-ins/1.10.21/i18n/Spanish.json"

		$(document).ready(function(){
				$('#dataTable').DataTable({
					dom: 'Bfrtip',
					buttons: [
						'copy', 'csv', 'excel', 'pdf', 'print'
							],
						"language" : {
							"url" : cdn
							}
						});
					})			
	</script>

</body>
</html>