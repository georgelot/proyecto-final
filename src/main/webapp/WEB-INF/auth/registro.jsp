<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Administracion Edificio</title>
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Crear Registro Comunidad</h3></div>
                                    <div class="card-body">
                                        <form>
                                            <div class="form-row">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputFirstName">Nombre</label>
                                                        <input class="form-control py-3" id="inputFirstName" type="text" placeholder="Ingrese su nombre" />
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Apellido</label>
                                                        <input class="form-control py-3" id="inputLastName" type="text" placeholder="Ingrese su apellido" />
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Rut</label>
                                                        <input class="form-control py-3" id="inputLastName" type="text" placeholder="Ingrese su rut sin puntos y con guion" />
                                                    </div>
                                                </div>
                                                <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Telefono</label>
                                                        <input class="form-control py-3" id="inputLastName" type="text" placeholder="Ingrese su telefono" />
                                                    </div>
                                                </div>
                                                <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Correo </label>
                                                        <input class="form-control py-3" id="inputLastName" type="email"  placeholder="Ingrese su correo" />
                                                    </div>
                                                </div>
                                                  <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Rol</label>
                                                        <select id="inputDepartamento" class="form-control">
												        	<option selected>Seleccione...</option>
												        	<option>Administrador</option>
												        	<option>Conserje</option>
												        	<option>Residente</option>
										      				</select>
                                    			</div>
                                                </div>
                                                <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Departamento</label>
                                                        	<select id="inputDepartamento" class="form-control">
												        	<option selected>Seleccione...</option>
												        	<option>001</option>
												        	<option>101</option>
												        	<option>201</option>
												        	<option>301</option>
										      				</select>
                                                    </div>
                                                </div>
                                                <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Contraseña</label>
                                                        <input class="form-control py-3" id="inputLastName" type="password" placeholder="Ingrerse su contraseña" />
                                                    </div>
                                                </div>
                                                <div class="col-md-5">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="inputLastName">Confirme Contraseña</label>
                                                        <input class="form-control py-3" id="inputLastName" type="password" placeholder="Repita su contraseña" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group mt-4 mb-0">
                                            	<a class="btn btn-primary btn-block" href='<c:out value="/login" />'>Creacion de Cuenta</a>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center">
                                        <div class="small"><a href="login">Ya tienes tu cuenta? Inicia tu sesion</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Building Admin 2020</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>
