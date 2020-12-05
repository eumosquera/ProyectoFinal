<%-- 
    Document   : PosiblesClientes
    Created on : 2/12/2020, 11:59:09 PM
    Author     : urrutia03
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
        <title>Posibles clientes</title>
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
        <link href="css/sweetalert.css"rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript">  </script>
        
    </head>
    <body>
        <div calss ="container">
            <div class ="card mx-auto mt-5">
                <div class="card-header" class="align-content-lg-center">CREAR POSIBLES CLIENTES</div>
                <div class="card-body">
                    <form  action="PosiblesClientesController" method="post">
                        <div class ="form-group">
                            <div class = form-row>
                                <div class="col-md-6">
                                    <input type="submit" name="btnGuardar"class="btn btn-primary" value="Guardar" />
                                    <input type="submit" name="btnModificar" value="Modificar" class="btn btn-primary" />
                                    <input type="submit" name="btnCancelar" value="Cancelar" class="btn btn-primary"/>
                                    <input type="submit" name="btnVolver" value="Volver" class="btn btn-primary" />
                                </div>
                            </div>
                        </div>
                        <div class ="form-group">
                            <div class= "form-row">
                                <h1>Informacion de Posible cliente</h1>
                            </div>
                            <div class="form-group">
                                <div class = "form-row">
                                    <div class="col-md-3">
                                        <label name="lblEmpresa">Empresa</label>
                                        <input class="form-control" type="text" name="txtEmpresa" placeholder="Empresa"required=""/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblNombre">Nombre</label>
                                        <input class="form-control" type="text" name="txtNombre" placeholder="Nombre"required=""/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblApellido">Apellido</label>
                                        <input class="form-control" type="text" name="txtApellido" placeholder="Apellido"required=""/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTitulo">Titulo</label>
                                        <input class="form-control" type="text" name="txtTitulo" placeholder="Titulo"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class = "form-row">
                                    <div class="col-md-3">
                                        <label name="lblCorreo">Correo electronico</label>
                                        <input class="form-control" type="email" name="txtCorreo" placeholder="Correo electronico"required=""/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTelefono">Telefono</label>
                                        <input class="form-control" type="number" name="txtTelefono" placeholder="Telefono"required=""/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblFax">Fax</label>
                                        <input class="form-control" type="text" name="txtFax" placeholder="Fax"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblMovil">Movil</label>
                                        <input class="form-control" type="number" name="txtMovil" placeholder="Movil"/>

                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class = "form-row">
                                    <div class="col-md-3">
                                        <label name="lblStioWeb">Sitio web</label>
                                        <input class="form-control" type="text" name="txtSitioWeb" placeholder="Sitio web"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblFuenteCliente">Fuente de posible cliente</label>
                                        <select class="form-control" name="FuenteCliente">
                                            <option value="1" > None</option>
                                            <option value="2"> Aviso</option>
                                            <option value="3"> Llamada no solicitada</option>
                                            <option value="4"> Recomendacion de empleado</option>
                                            <option value="5"> Recomendacion externa</option>
                                            <option value="6"> Tienda en linea</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblEstadoCliente">Estado de posible cliente</label>
                                        <select class="form-control" name="ddlEstadoCliente">
                                            <option value="1"> None</option>
                                            <option value="2"> Intento de contacto</option>
                                            <option value="3"> Contatactar en el futuro</option>
                                            <option value="4"> Contactado</option>
                                            <option value="5"> Posible cliente no solicitado</option>
                                            <option value="6"> Posible cliente perdido</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblSector">Sector</label>
                                        <select class="form-control" name="ddlSector">
                                            <option value="1"> None</option>
                                            <option value="2"> APS (Proveedor de Servicio de Aplicaciones)</option>
                                            <option value="3"> OEM de datos</option>
                                            <option value="4"> ERP (Planificacion de Recursos de Empresa)</option>
                                            <option value="5"> Gobierno/Ejercito</option>
                                            <option value="6"> Empresa grande</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class = "form-row">
                                    <div class="col-md-3">
                                        <label name="lblCantidadEmpleados">Cantidad de empleados</label>
                                        <input class="form-control" type="number" name="txtCantidadEmpleados" placeholder="Cantidad de empleados"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblIngresoAnual">Ingresos anuales</label>
                                        <input class="form-control" type="text" name="txtIngresoAnual" placeholder="Ingresos anuales"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblCalificacion">Calificacion</label>
                                        <select class="form-control" name="ddlCalificacion">
                                            <option value="1"> None</option>
                                            <option value="2"> Adquirido</option>
                                            <option value="3"> Activo</option>
                                            <option value="4"> Fallo de mercado</option>
                                            <option value="5"> Proyecto canelado</option>
                                            <option value="6"> Apagar</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3 mt-4">
                                        <div class="form-group form-check" >
                                            <input type="checkbox" class="form-check-input" id="NoCorreo" name="NoCorreo">
                                            <label class="form-check-label" for="NoCorreo">No participacion correo electrónico</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class = "form-row">

                                    <div class="col-md-3">
                                        <label name="lblIDSkype">ID de Skype</label>
                                        <input class="form-control" type="text" name="txtIDSkype" placeholder="ID de Skype"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTwitter">Twitter</label>
                                        <input class="form-control" type="text" name="txtTwitter" placeholder="Twitter"/>
                                    </div>
                                    <div class="col-md-6">
                                        <label name="lblCorreo2">Correo electronico segundario</label>
                                        <input class="form-control" type="text" name="txtCorreo2" placeholder="correo electronico segundario"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</body>
</html>