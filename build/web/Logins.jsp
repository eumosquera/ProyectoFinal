<%-- 
    Document   : Logins
    Created on : 2/12/2020, 12:13:58 PM
    Author     : ing.soporte
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
        <title>Logins</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet" type="text/css">
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css">
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>

    </head>

    <body class="bg-dark">
        <%
            if (request.getAttribute("stError") != null) {
        %>
        <input type="text" hidden="" id="txtMensaje" value=" <%=request.getAttribute("stError").toString()%>"/>
        <script>
            swal("Alerta", document.getElementById("txtMensaje").value, "error")
        </script>
        <%
            }
        %>


        <div class="container">
            <div class="row">
                <div class="col-sm-4 offset-sm-4">
                    <div class="card card-login mx-auto mt-5">
                        <div class="card-header">Login</div>
                        <div class="card-body">
                            <form action="LoginController" method="post">
                                <div class="form-group">
                                    <label for="lblEmail1">Email</label>
                                    <input class="form-control" name="txtEmail1" type="email" aria-describedby="emailHelp" placeholder="Ingrese Email">
                                </div>
                                <div class="form-group">
                                    <label for="lblPassword">Password</label>
                                    <input class="form-control" name="txtPassword" type="password" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input class="form-check-input" type="checkbox" name="chkRecordar"> Recordar Password</label>
                                    </div>
                                </div>
                                <input name="btnAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar"/>
                            </form>
                            <div class="text-center">
                                <a class="d-block small mt-3" href="Registrar.jsp">Registrar cuenta</a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </body>
</html>
