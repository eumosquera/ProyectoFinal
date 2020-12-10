<%-- 
    Document   : Registrar
    Created on : 2/12/2020, 11:30:16 PM
    Author     : 57318
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Registrar</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    </head>
    <body class="bg-dark">
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar</div>
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIdentificacion">Identificacion</label>
                                    <input class="form-control" name="txtIdentificacion" type="text" placeholder="Ingrese identificacion">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPrimerNombre">Primer nombre</label>
                                    <input class="form-control" name="txtPrimerNombre" type="text" placeholder="Ingrese primer nombre">
                                    <br>
                                </div>
                                <div class="col-md-6">
                                    <label for="lblSegundoNombre">Segundo nombre</label>
                                    <input class="form-control" name="txtSegundoNombre" type="text" placeholder="Ingrese segundo nombre">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPrimerApellido">Primer apellido</label>
                                    <input class="form-control" name="txtPrimerApellido" type="text" placeholder="Ingrese primer apellido">
                                    <br>
                                </div>
                                <div class="col-md-6">
                                    <label for="lblSegundoApellido">Segundo Apellido</label>
                                    <input class="form-control" name="txtSegundoApellido" type="text" placeholder="Ingrese segundo apellido">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblDireccion">Dirección</label>
                                    <input class="form-control" name="txtDireccion" type="text" placeholder="Ingrese direccion">
                                    <br>
                                </div>
                                <div class="col-md-6">
                                    <label for="lblTelefono">Teléfono</label>
                                    <input class="form-control" name="txtTelefono" type="text" placeholder="Ingrese telefono">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblCorreo">Correo</label>
                                    <input class="form-control" name="txtCorreo" type="text" placeholder="Ingrese Correo">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPassword">Contraseña</label>
                                    <input class="form-control" name="txtPassword" type="password" placeholder="Ingrese Contraseña">
                                    <br>
                                </div>
                                <div class="col-md-6">
                                    <label for="lblConfirmarContraseña">Confirmar contraseña</label>
                                    <input class="form-control" name="txtConfirmarContraseña" type="password" placeholder="Confirmar Contraseña">
                                    <br>
                                </div>
                            </div>
                        </div>

                        <input name="btnAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar" />
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Login.jsp">Login</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
