<%-- 
    Document   : Registrar
    Created on : 2/12/2020, 11:30:16 PM
    Author     : 57318
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
        <link href="css/sweetalert.css" rel="stylesheet"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
    </head>
    <body class="bg-dark">
        <%
            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {
        %>    
        <input type="text" hidden="" id="txtMensaje" value="<%=request.getAttribute("stMensaje")%>"/>
        <input type="text" hidden="" id="txtTipo" value="<%=request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;

            swal("Mensaje", mensaje, tipo);
        </script>
        <%
            }
        %>    
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar</div>
                <div class="card-body">
                    <form action="LoginController" method="POST">
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblLogin">Login</label>
                                    <input class="form-control" name="txtLogin" type="text" placeholder="Ingrese login">
                                    <br>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblPassword">Contraseña</label>
                                    <input class="form-control" name="txtPassword" type="password" placeholder="Ingrese Contraseña">
                                    <br>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-12">
                                        <label for="lblConfirmarContraseña">Confirmar contraseña</label>
                                        <input class="form-control" name="txtConfirmarContraseña" type="password" placeholder="Confirmar Contraseña">
                                        <br>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <input name="btnRegistrar" type="submit" class="btn btn-primary btn-block" value="Aceptar" />
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Login.jsp">Login</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
