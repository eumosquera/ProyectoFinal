<%-- 
    Document   : PosiblesClientes
    Created on : 2/12/2020, 11:59:09 PM
    Author     : urrutia03
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
    </head>
    <body>
        <%
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            List<Models.clsPosiblesClientes> lstclsPosiblesClienteses
                    = new ArrayList<Models.clsPosiblesClientes>();
            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClienteses = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {
        %>
        <input type="text" hidden="" id="txtMensaje"
               value="<%=request.getAttribute("stMensaje")%>"/>
        <input type="text" hidden="" id="txtTipo"
               value="<%=request.getAttribute("stTipo")%>"/>
        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;
            swal("Mensaje", mensaje, tipo);
        </script>
        <%
            }
        %>

        <div calss ="container">
            <div class ="card mx-auto mt-5">
                <div class="card-header" class="align-content-lg-center">CREAR POSIBLES CLIENTES</div>
                <div class="card-body">
                    <form  action="PosiblesClientesController" method="post">

                        <div class ="form-group">
                            <div class= "form-row">
                                <h1>Informacion de Posible cliente</h1>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label name="lblEmpresa">Empresa</label>
                                        <input type="text" placeholder="Empresa" name="txtEmpresa" 
                                               class="form-control" 
                                               value="<%= obclsPosiblesClientes.getStEmpresa() != null ? obclsPosiblesClientes.getStEmpresa() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblNombre">Nombre</label>
                                        <input type="text" placeholder="Nombre" name="txtNombre" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStNombre() != null ? obclsPosiblesClientes.getStNombre() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblApellido">Apellidos</label>
                                        <input type="text" placeholder="Apellido" name="txtApellidos" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStApellido() != null ? obclsPosiblesClientes.getStApellido() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTitulo">Titulo</label>
                                        <input type="text" placeholder="Titulo" name="txtTitulo" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStTitulo() != null ? obclsPosiblesClientes.getStTitulo() : ""%>"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label name="lblCorreo">Correo electronico</label>
                                        <input type="email" placeholder="Correo electronico" 
                                               name="txtCorreo" class="form-control"
                                               value="<%= obclsPosiblesClientes.getStCorreo() != null ? obclsPosiblesClientes.getStCorreo() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTelefono">Telefono</label>
                                        <input type="text" placeholder="Telefono" name="txtTelefono" 
                                               class="form-control"
                                               value="<%=obclsPosiblesClientes.getStTelefono () !=null ? obclsPosiblesClientes.getStTelefono():""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblFax">Fax</label>
                                        <input type="text" placeholder="Fax" name="txtFax" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStFax() != null ? obclsPosiblesClientes.getStFax() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblMovil">Movil</label>
                                        <input type="text" placeholder="Movil" name="txtMovil" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStMovil() != null ? obclsPosiblesClientes.getStMovil() : ""%>"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label name="lblSitioWeb">Sitio web</label>
                                        <input type="text" placeholder="Sitio web" name="txtSitioWeb" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStSitioWeb() != null ? obclsPosiblesClientes.getStSitioWeb() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblFuentePosibleCliente">Fuente de posible cliente</label>
                                        <select class="form-control " name="ddlFuentePosibleCliente">
                                            <option value="1" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                            <option value="2" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 2 ? "selected" : "" : ""%>>Aviso</option>
                                            <option value="3" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 3 ? "selected" : "" : ""%>>Llamada no solicitada</option>
                                            <option value="4" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 4 ? "selected" : "" : ""%>>Recomendacion de empleado</option>
                                            <option value="5" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 5 ? "selected" : "" : ""%>>Recomendacion externa</option>
                                            <option value="6" <%= obclsPosiblesClientes.obclsFuenteCliente != null ? obclsPosiblesClientes.obclsFuenteCliente.getInCodigo() == 6 ? "selected" : "" : ""%>>Tienda en linea</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblEstadoPosibleCliente">Estado de posible cliente</label>
                                        <select class="form-control" name="ddlEstadoPosibleCliente">
                                            <option value="1" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                            <option value="2" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 2 ? "selected" : "" : ""%>>Intento de contacto</option>
                                            <option value="3" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 3 ? "selected" : "" : ""%>>Contactar en el futuro</option>
                                            <option value="4" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 4 ? "selected" : "" : ""%>>Contactado</option>
                                            <option value="5" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 5 ? "selected" : "" : ""%>>Posible cliente no solicitado</option>
                                            <option value="6" <%= obclsPosiblesClientes.obclsEstadoCliente != null ? obclsPosiblesClientes.obclsEstadoCliente.getInCodigo() == 6 ? "selected" : "" : ""%>>Posible cliente perdido</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblSector">Sector</label>
                                        <select class="form-control" name="ddlSector" >
                                            <option value="1" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                            <option value="2" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 2 ? "selected" : "" : ""%>>APS(Proveedor de servicios de aplicaciones)</option>
                                            <option value="3" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 3 ? "selected" : "" : ""%>>OEM de datos</option>
                                            <option value="4" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 4 ? "selected" : "" : ""%>>ERP(Planificacion de recursos de empresa)</option>
                                            <option value="5" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 5 ? "selected" : "" : ""%>>Gobierno/Ejercito</option>
                                            <option value="6" <%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 6 ? "selected" : "" : ""%>>Empresa grande</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label name="lblCantidadEmpleados">Cantidad de empleados</label>
                                        <input type="number" placeholder="Cantidad de empleados" 
                                               name="txtCantidadEmpleados" class="form-control"
                                               value="<%= obclsPosiblesClientes.getinCantidaEmpleado()!= 0 ? obclsPosiblesClientes.getinCantidaEmpleado() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblIngresosAnueales">Ingreses anuales</label>
                                        <input type="number" placeholder="Ingresos anuelaes" 
                                               name="txtIngresosAnueales" class="form-control"
                                               value="<%= obclsPosiblesClientes.getDbIngresoAnual() != 0 ? obclsPosiblesClientes.getDbIngresoAnual() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblCalificacion">Calificacion</label><br>
                                        <select class="form-control" name="ddlCalificacion">
                                            <option value="1" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                            <option value="2" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 2 ? "selected" : "" : ""%>>Adquirido</option>
                                            <option value="3" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 3 ? "selected" : "" : ""%>>Activo</option>
                                            <option value="4" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 4 ? "selected" : "" : ""%>>Contactado</option>
                                            <option value="5" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 5 ? "selected" : "" : ""%>>Fallo de mercado</option>
                                            <option value="6" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 6 ? "selected" : "" : ""%>>Proyecto cancelado</option>
                                            <option value="7" <%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 7 ? "selected" : "" : ""%>>Apagar</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3"><br>
                                        <label name="lblNoCorreo">
                                            <input type="checkbox" class="from-control" 
                                                   name="chkNoCorreo"
                                                   <%= obclsPosiblesClientes.getChNoCorreo()== 'S' ? "checked" : " "%>/>    
                                            No participacion correo electronico
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label name="lblIDSkype">ID de Skype</label>
                                        <input type="text" placeholder="ID de Skype" name="txtIDSkype" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStIDSkype() != null ? obclsPosiblesClientes.getStIDSkype() : ""%>"/>
                                    </div>
                                    <div class="col-md-3">
                                        <label name="lblTwitter">Twitter</label>
                                        <input type="text" placeholder="Twitter" name="txtTwitter" 
                                               class="form-control"
                                               value="<%= obclsPosiblesClientes.getStTwitter() != null ? obclsPosiblesClientes.getStTwitter() : ""%>"/>
                                    </div>
                                    <div class="col-md-6">
                                        <label name="lblCorreo2">Correo electronico secundario</label>
                                        <input type="email" placeholder="Correo electronico secundario" 
                                               name="txtCorreo2" class="form-control"
                                               value="<%= obclsPosiblesClientes.getStCorreo2()
                                                   != null ? obclsPosiblesClientes.getStCorreo2() : ""%>"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-6">
                                        <input type="submit" value="Guardar" 
                                               class="btn btn-outline-primary" name="btnGuardar"/>
                                        <input type="submit" value="Modificar" 
                                               class="btn btn-outline-primary" name="btnModificar"/>
                                        <input type="submit" value="Cancelar" 
                                               class="btn btn-outline-primary" name="btnCancelar"/>
                                        <a class="btn btn-outline-primary position-sticky" href="Index.jsp">Volver</a>
                                        <input type="text" name="codigoModificar"
                                               id="codigoModificar" value="<%= obclsPosiblesClientes.getInCodigo()%>"
                                               hidden=""/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-12">
                                        <bl> 
                                            <i class="fa fa-clipboard"></i>
                                            Registros: <%= lstclsPosiblesClienteses.size()%>
                                        </bl>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-row">
                                    <div class="col-md-12">
                                        <table class="table table-bordered table-info table-responsive">
                                            <tr>
                                                <td>Empresa</td>
                                                <td>Nombre</td>
                                                <td>Apellido</td>
                                                <td>Titulo</td>
                                                <td>Correo electronico</td>
                                                <td>Telefono</td>
                                                <td>Fax</td>
                                                <td>Movil</td>
                                                <td>Sitio web</td>
                                                <td>Fuente posible cliente</td>
                                                <td>Estado posible cliente</td>
                                                <td>Sector</td>
                                                <td>Cantidad de empleados</td>
                                                <td>Ingresos anuales</td>
                                                <td>Calificacion</td>
                                                <td>No participacion correo electronico</td>
                                                <td>ID Skype</td>
                                                <td>Twitter</td>
                                                <td>Correo electronico secundario</td>
                                                <td>Opciones</td>
                                            </tr>
                                            <%
                                                for (Models.clsPosiblesClientes item : lstclsPosiblesClienteses) {
                                                    Models.clsFuenteCliente obclsFuenteCliente = item.getObclsFuenteCliente();
                                                    Models.clsEstadoCliente obclsEstadoCliente = item.getObclsEstadoCliente();
                                                    Models.clsSector obclsSector = item.getObclsSector();
                                                    Models.clsCalificacion obclsCalificacion = item.getObclsCalificacion();
                                            %>
                                            <tr>
                                                <td><%= item.getStEmpresa()%></td>
                                                <td><%= item.getStNombre()%></td>
                                                <td><%= item.getStApellido()%></td>
                                                <td><%= item.getStTitulo()%></td>
                                                <td><%= item.getStCorreo()%></td>
                                                <td><%= item.getStTelefono()%></td>
                                                <td><%= item.getStFax()%></td>
                                                <td><%= item.getStMovil()%></td>
                                                <td><%= item.getStSitioWeb()%></td>
                                                <td><%= obclsFuenteCliente.getStDescripcion()%></td>
                                                <td><%= obclsEstadoCliente.getStDescripcion()%></td>
                                                <td><%= obclsSector.getStDescripcion()%></td>
                                                <td><%= item.getinCantidaEmpleado()%></td>
                                                <td><%= item.getDbIngresoAnual()%></td>
                                                <td><%= obclsCalificacion.getStDescripcion()%></td>
                                                <td><%= item.getChNoCorreo()%></td>
                                                <td><%= item.getStIDSkype()%></td>
                                                <td><%=item.getStTwitter()%></td>
                                                <td><%= item.getStCorreo2()%></td>
                                                <td>
                                                    <a class="btn btn-success btn-sm"
                                                       href="PosiblesClientesController?stOpcion=M&codigoSeleccionado=<%= item.getInCodigo()%>">
                                                        Modificar</a>
                                                    <a class="btn btn-danger btn-sm"
                                                       href="PosiblesClientesController?stOpcion=E&codigoSeleccionado=<%= item.getInCodigo()%>">
                                                        Eliminar</a>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>

                                        </table>

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