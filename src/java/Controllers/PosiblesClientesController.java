/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.clsFuenteCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ing.soporte
 */
@WebServlet(name = "PosiblesClientesController", urlPatterns = {"/PosiblesClientesController"})
public class PosiblesClientesController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btnGuardar") != null) {
            btnGuardar(request, response);
        } else if (request.getParameter("btnModificar") != null) {

        } else if (request.getParameter("btnCancelar") != null) {

        }
    }

    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();

            Models.clsFuenteCliente obclsFuenteCliente = new Models.clsFuenteCliente();
            Models.clsEstadoCliente obclsEstadoCliente = new Models.clsEstadoCliente();
            Models.clsSector obclsSector = new Models.clsSector();
            Models.clsCalificacion obclsCalificacion = new Models.clsCalificacion();

            if (request.getParameter("txtEmpresa") != null) {
                obclsPosiblesClientes.setStEmpresa(request.getParameter("txtEmpresa"));
            }
            if (request.getParameter("txtNombre") != null) {
                obclsPosiblesClientes.setStNombre(request.getParameter("txtNombre"));
            }
            if (request.getParameter("txtApellido") != null) {
                obclsPosiblesClientes.setStApellido(request.getParameter("txtApellido"));
            }
            if (request.getParameter("txtTitulo") != null) {
                obclsPosiblesClientes.setStTitulo(request.getParameter("txtTitulo"));
            }
            if (request.getParameter("txtCorreo") != null) {
                obclsPosiblesClientes.setStCorreo(request.getParameter("txtCorro"));
            }
            if (request.getParameter("txtTelefono") != null) {
                obclsPosiblesClientes.setStTelefono(Integer.parseInt(request.getParameter("txtTelefono")));
            }
            if (request.getParameter("txtFax") != null) {
                obclsPosiblesClientes.setStFax(request.getParameter("txtFax"));
            }
            if (request.getParameter("txtMovil") != null) {
                obclsPosiblesClientes.setStMovil(Integer.parseInt(request.getParameter("txtMovil")));
            }
            if (request.getParameter("txtSitioWeb") != null) {
                obclsPosiblesClientes.setStSitioWeb(request.getParameter("txtSitioWeb"));
            }

            //LISTA DESPLEGABLE FUENTE POSIBLE CLIENTE
            if (request.getParameter("lblFuenteCliente") != null) {
                obclsFuenteCliente.setInCodigo(Integer.parseInt(request.getParameter("lblFuenteCliente")));

                String stDescripcion = "";

                if (request.getParameter("lblFuenteCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("lblFuenteCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("lblFuenteCliente").equals("3")) {
                    stDescripcion = "Llamada no solicitada";
                } else if (request.getParameter("lblFuenteCliente").equals("4")) {
                    stDescripcion = "Recomendacion de empleado";
                } else if (request.getParameter("lblFuenteCliente").equals("5")) {
                    stDescripcion = "Recomendacion externa";
                } else if (request.getParameter("lblFuenteCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                }
                obclsFuenteCliente.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsFuenteCliente(obclsFuenteCliente);
            }
            //LISTA DESPLEGABLE ESTADO CLIENTE
            if (request.getParameter("lblEstadoCliente") != null) {
                obclsEstadoCliente.setInCodigo(Integer.parseInt(request.getParameter("lblEstadoCliente")));

                String stDescripcion = "";

                if (request.getParameter("lblEstadoCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("lblEstadoCliente").equals("2")) {
                    stDescripcion = "Intento de contacto";
                } else if (request.getParameter("lblEstadoCliente").equals("3")) {
                    stDescripcion = "Contactar en el futuro";
                } else if (request.getParameter("lblEstadoCliente").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("lblEstadoCliente").equals("5")) {
                    stDescripcion = "Posible cliente no solicitado";
                } else if (request.getParameter("lblEstadoCliente").equals("6")) {
                    stDescripcion = "Posible cliente perdido";
                }
                obclsEstadoCliente.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsEstadoCliente(obclsEstadoCliente);
            }
            //LISTA DESPLEGABLE SECTOR
            if (request.getParameter("lblSector") != null) {
                obclsSector.setInCodigo(Integer.parseInt(request.getParameter("lblSector")));

                String stDescripcion = "";

                if (request.getParameter("lblSector").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("lblSector").equals("2")) {
                    stDescripcion = "APS(Proveedor de Servicios de Aplicaciones)";
                } else if (request.getParameter("lblSector").equals("3")) {
                    stDescripcion = "OEM de datos";
                } else if (request.getParameter("lblSector").equals("4")) {
                    stDescripcion = "ERP (Planificaion de Recursos de Empresa)";
                } else if (request.getParameter("lblEstadoCliente").equals("5")) {
                    stDescripcion = "Gobierno/ejercito";
                } else if (request.getParameter("lblSector").equals("6")) {
                    stDescripcion = "Empresa grande";
                }
                obclsSector.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsSector(obclsSector);
            }
            if (request.getParameter("txtCantidadEmpleados") != null) {
                obclsPosiblesClientes.setCantidaEmpleado(Integer.parseInt(request.getParameter("txtCantidadEmpleados")));
            }
            if (request.getParameter("txtIngresoAnual") != null) {
                obclsPosiblesClientes.setDbIngresoAnual(Double.parseDouble(request.getParameter("txtIngresoAnual")));
            }

            //LISTA DESPLEGABLE CALIFICACION
            if (request.getParameter("lblCalificaion") != null) {
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("lblCalificaion")));

                String stDescripcion = "";

                if (request.getParameter("lblCalificaion").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("lblCalificaion").equals("2")) {
                    stDescripcion = "Adquirido";
                } else if (request.getParameter("lblCalificaion").equals("3")) {
                    stDescripcion = "Activo";
                } else if (request.getParameter("lblCalificaion").equals("4")) {
                    stDescripcion = "Fallo de mercado";
                } else if (request.getParameter("lblCalificaion").equals("5")) {
                    stDescripcion = "Proyecto cancelado";
                } else if (request.getParameter("lblCalificaion").equals("6")) {
                    stDescripcion = "Apagar";
                }
                obclsCalificacion.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObcCalificacion(obclsCalificacion);
            }
            if (request.getParameter("txtNoCorreo") != null) {
                char chSeleccion = request.getParameter("txtNoCorreo").equals("on")
                        ? 'S' : 'N';
                obclsPosiblesClientes.setChNoCorreo(chSeleccion);

            }
            if (request.getParameter("txtIDSkype") != null) {
                obclsPosiblesClientes.setStIDSkype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtTwitter") != null) {
                obclsPosiblesClientes.setStTwitter(request.getParameter("txtTwitter"));
            }
            if (request.getParameter("txtCorreo2") != null) {
                obclsPosiblesClientes.setStCorreo2(request.getParameter("txtCorreo2"));
            }
            HttpSession session = request.getSession(true); // VARIABLE DE SESSION
            
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>(); //LISTA DE OBJETOS 
            
            if (session.getAttribute("session_lstclsPosiblesClientes")!=null){ // VALIDAR EXIXTENCIA DE LA VARIABLE DE SESSION
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>)session.getAttribute("session_lstclsPosiblesClientes");
            }
            int inCodigo = lstclsPosiblesClientes.size() + 1; // CALCULO AUTOMATICO DEL REGISTRO INCLUYE LINEA NEXT
            obclsPosiblesClientes.setInCodigo(inCodigo);
            
            lstclsPosiblesClientes.add(obclsPosiblesClientes); // AGREGAR OBJETO A LA LISTA
            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes); // CREAR LA VARIABLE
            
            request.setAttribute("stMensaje", "Proceso realizado exitosamente"); /* DEFINIR VALORES INCLUYE LA LINEA NEXT */
            request.setAttribute("stTipo", "success");
            
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response); // REDIRECCION Y ENVIO DE VALORES

        } catch (Exception ex) {
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
