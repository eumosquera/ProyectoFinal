/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.clsFuenteCliente;
import Models.clsPosiblesClientes;
import Models.clsEstadoCliente;
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
            btnModificar(request, response);

        } else if (request.getParameter("btnCancelar") != null) {

        } else if (request.getParameter("codigoSeleccionado") != null) {
            if (request.getParameter("stOpcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stOpcion").equals("E")) {
                btnEliminar(request, response);
            }
        }
    }

    public void btnModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {

                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            int inPosicion = 0;
            for (clsPosiblesClientes elem : lstclsPosiblesClientes) {

                if (elem.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                    break;
                }
                
            }

            Models.clsFuenteCliente obclsFuenteCliente = new Models.clsFuenteCliente();
            Models.clsEstadoCliente obclsEstadoCliente = new Models.clsEstadoCliente();
            Models.clsSector obclsSector = new Models.clsSector();
            Models.clsCalificacion obclsCalificacion = new Models.clsCalificacion();
            inPosicion++;

            if (request.getParameter("txtEmpresa") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStEmpresa(request.getParameter("txtEmpresa"));
            }
            if (request.getParameter("txtNombre") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStNombre(request.getParameter("txtNombre"));
            }
            if (request.getParameter("txtApellido") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStApellido(request.getParameter("txtApellido"));
            }
            if (request.getParameter("txtTitulo") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStTitulo(request.getParameter("txtTitulo"));
            }
            if (request.getParameter("txtCorreo") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStCorreo(request.getParameter("txtCorreo"));
            }
            if (request.getParameter("txtTelefono") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStTelefono(request.getParameter("txtTelefono"));
            }
            if (request.getParameter("txtFax") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStFax(request.getParameter("txtFax"));
            }
            if (request.getParameter("txtMovil") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStMovil(request.getParameter("txtMovil"));
            }
            if (request.getParameter("txtSitioWeb") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStSitioWeb(request.getParameter("txtSitioWeb"));
            }

            if (request.getParameter("ddlFuenteCliente") != null) {
                obclsFuenteCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuenteCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlFuenteCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFuenteCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuenteCliente").equals("3")) {
                    stDescripcion = "Llamada no solicitada";
                } else if (request.getParameter("ddlFuenteCliente").equals("4")) {
                    stDescripcion = "Recomendacion de empleado";
                } else if (request.getParameter("ddlFuenteCliente").equals("5")) {
                    stDescripcion = "Recomendacion externa";
                } else if (request.getParameter("ddlFuenteCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                }

                obclsFuenteCliente.setStDescripcion(stDescripcion);

                lstclsPosiblesClientes.get(inPosicion).setObclsFuenteCliente(obclsFuenteCliente);

            }

            if (request.getParameter("ddlEstadoCliente") != null) {
                obclsEstadoCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlEstadoCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstadoCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlEstadoCliente").equals("2")) {
                    stDescripcion = "Intento de contacto";
                } else if (request.getParameter("ddlEstadoCliente").equals("3")) {
                    stDescripcion = "Contactar en el futuro";
                } else if (request.getParameter("ddlEstadoCliente").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("ddlEstadoCliente").equals("5")) {
                    stDescripcion = "Posible cliente no solicitado";
                } else if (request.getParameter("ddlEstadoCliente").equals("6")) {
                    stDescripcion = "Posible cliente perdido";
                }

                obclsEstadoCliente.setStDescripcion(stDescripcion);

                lstclsPosiblesClientes.get(inPosicion).setObclsEstadoCliente(obclsEstadoCliente);

            }

            if (request.getParameter("ddlSector") != null) {
                obclsSector.setInCodigo(Integer.parseInt(request.getParameter("ddlSector")));

                String stDescripcion = "";

                if (request.getParameter("ddlSector").equals("1")) {
                    stDescripcion = "Seleccione";
                } else if (request.getParameter("ddlSector").equals("2")) {
                    stDescripcion = "APS(Proveedor de servicios de aplicaciones)";
                } else if (request.getParameter("ddlSector").equals("3")) {
                    stDescripcion = "OEM de datos";
                } else if (request.getParameter("ddlSector").equals("4")) {
                    stDescripcion = "ERP(Planificacion de recursos de empresa)";
                } else if (request.getParameter("ddlSector").equals("5")) {
                    stDescripcion = "Gobierno/Ejercito";
                } else if (request.getParameter("ddlSector").equals("6")) {
                    stDescripcion = "Empresa grande";
                }

                obclsSector.setStDescripcion(stDescripcion);

                lstclsPosiblesClientes.get(inPosicion).setObclsSector(obclsSector);

            }

            if (request.getParameter("txtCantidaEmpleado") != null) {
                lstclsPosiblesClientes.get(inPosicion).setinCantidaEmpleado(Integer.parseInt(request.getParameter("txtCantidaEmpleado")));
            }
            if (request.getParameter("txtIngresoAnual") != null) {
                lstclsPosiblesClientes.get(inPosicion).setDbIngresoAnual(Double.parseDouble(request.getParameter("txtIngresoAnual")));
            }

            if (request.getParameter("ddlCalificacion") != null) {
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlCalificacion")));

                String stDescripcion = "";

                if (request.getParameter("ddlCalificacion").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlCalificacion").equals("2")) {
                    stDescripcion = "Adquirido";
                } else if (request.getParameter("ddlCalificacion").equals("3")) {
                    stDescripcion = "Activo";
                } else if (request.getParameter("ddlCalificacion").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("ddlCalificacion").equals("5")) {
                    stDescripcion = "Fallo de mercado";
                } else if (request.getParameter("ddlCalificacion").equals("6")) {
                    stDescripcion = "Proyecto cancelado";
                } else if (request.getParameter("ddlCalificacion").equals("7")) {
                    stDescripcion = "Apagar";
                }

                obclsCalificacion.setStDescripcion(stDescripcion);

                lstclsPosiblesClientes.get(inPosicion).setObclsCalificacion(obclsCalificacion);

            }

            if (request.getParameter("chkNoCorreo") != null) {
                char chSeleccion = request.getParameter("chkNoCorreo").equals("on")
                        ? 'S' : 'N';
                lstclsPosiblesClientes.get(inPosicion).setChNoCorreo(chSeleccion);
            } else {
                lstclsPosiblesClientes.get(inPosicion).setChNoCorreo('N');
            }

            if (request.getParameter("txtIDSkype") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStIDSkype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtTwitter") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStTwitter(request.getParameter("txtTwitter"));
            }
            if (request.getParameter("txtCorreo2") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStCorreo2(request.getParameter("txtCorreo2"));
            }

            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);

            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        }

    }

    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();

            List<Models.clsPosiblesClientes> lstclsPosiblesClienteses = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClienteses = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");

            }

            for (Models.clsPosiblesClientes item : lstclsPosiblesClienteses) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsPosiblesClientes = item;
                    lstclsPosiblesClienteses.remove(item);
                    break;
                }
            }

            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClienteses);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        }

    }
    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();

            List<Models.clsPosiblesClientes> lstclsPosiblesClienteses = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClienteses = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }
            for (Models.clsPosiblesClientes item : lstclsPosiblesClienteses) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsPosiblesClientes = item;
                }
            }

            request.setAttribute("obclsPosiblesClientes", obclsPosiblesClientes);
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        }
    }


    public void btnGuardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
            if (request.getParameter("txtCorrreo") != null) {
                obclsPosiblesClientes.setStCorreo(request.getParameter("txtCorreo"));
            }
            if (request.getParameter("txtTelefono") != null) {
                obclsPosiblesClientes.setStTelefono(request.getParameter("txtTelefono"));
            }
            if (request.getParameter("txtFax") != null) {
                obclsPosiblesClientes.setStFax(request.getParameter("txtFax"));
            }
            if (request.getParameter("txtMovil") != null) {
                obclsPosiblesClientes.setStMovil(request.getParameter("txtMovil"));
            }
            if (request.getParameter("txtSitioWeb") != null) {
                obclsPosiblesClientes.setStSitioWeb(request.getParameter("txtSitioWeb"));
            }

            if (request.getParameter("ddlFuenteCliente") != null) {
                obclsFuenteCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuenteCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlFuenteCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFuenteCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuenteCliente").equals("3")) {
                    stDescripcion = "Llamada no solicitada";
                } else if (request.getParameter("ddlFuenteCliente").equals("4")) {
                    stDescripcion = "Recomendacion de empleado";
                } else if (request.getParameter("ddlFuenteCliente").equals("5")) {
                    stDescripcion = "Recomendacion externa";
                } else if (request.getParameter("ddlFuenteCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                }

                obclsFuenteCliente.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsFuenteCliente(obclsFuenteCliente);

            }

            if (request.getParameter("ddlEstadoCliente") != null) {
                obclsEstadoCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlEstadoCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstadoCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlEstadoCliente").equals("2")) {
                    stDescripcion = "Intento de contacto";
                } else if (request.getParameter("ddlEstadoCliente").equals("3")) {
                    stDescripcion = "Contactar en el futuro";
                } else if (request.getParameter("ddlEstadoCliente").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("ddlEstadoCliente").equals("5")) {
                    stDescripcion = "Posible cliente no solicitado";
                } else if (request.getParameter("ddlEstadoCliente").equals("6")) {
                    stDescripcion = "Posible cliente perdido";
                }

                obclsEstadoCliente.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsEstadoCliente(obclsEstadoCliente);

            }

            if (request.getParameter("ddlSector") != null) {
                obclsSector.setInCodigo(Integer.parseInt(request.getParameter("ddlSector")));

                String stDescripcion = "";

                if (request.getParameter("ddlSector").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlSector").equals("2")) {
                    stDescripcion = "APS(Proveedor de servicios de aplicaciones)";
                } else if (request.getParameter("ddlSector").equals("3")) {
                    stDescripcion = "OEM de datos";
                } else if (request.getParameter("ddlSector").equals("4")) {
                    stDescripcion = "ERP(Planificacion de recursos de empresa)";
                } else if (request.getParameter("ddlSector").equals("5")) {
                    stDescripcion = "Gobierno/Ejercito";
                } else if (request.getParameter("ddlSector").equals("6")) {
                    stDescripcion = "Empresa grande";
                }

                obclsSector.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsSector(obclsSector);

            }

            if (request.getParameter("txtCantidaEmpleado") != null) {
                obclsPosiblesClientes.setinCantidaEmpleado(Integer.parseInt(request.getParameter("txtCantidaEmpleado")));
            }
            if (request.getParameter("txtIngresosAnueales") != null) {
                obclsPosiblesClientes.setDbIngresoAnual(Double.parseDouble(request.getParameter("txtIngresosAnueales")));
            }

            if (request.getParameter("ddlCalificacion") != null) {
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlCalificacion")));

                String stDescripcion = "";

                if (request.getParameter("ddlCalificacion").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlCalificacion").equals("2")) {
                    stDescripcion = "Adquirido";
                } else if (request.getParameter("ddlCalificacion").equals("3")) {
                    stDescripcion = "Activo";
                } else if (request.getParameter("ddlCalificacion").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("ddlCalificacion").equals("5")) {
                    stDescripcion = "Fallo de mercado";
                } else if (request.getParameter("ddlCalificacion").equals("6")) {
                    stDescripcion = "Proyecto cancelado";
                } else if (request.getParameter("ddlCalificacion").equals("7")) {
                    stDescripcion = "Apagar";
                }

                obclsCalificacion.setStDescripcion(stDescripcion);

                obclsPosiblesClientes.setObclsCalificacion(obclsCalificacion);

            }

            if (request.getParameter("chkNoCorreo") != null) {
                char chSeleccion = request.getParameter("chkNoCorreo").equals("on")
                        ? 'S' : 'N';
                obclsPosiblesClientes.setChNoCorreo(chSeleccion);
            } else {
                obclsPosiblesClientes.setChNoCorreo('N');
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

            HttpSession session = request.getSession(true);

            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            int inCodigo = lstclsPosiblesClientes.size() + 1;
            obclsPosiblesClientes.setInCodigo(inCodigo);

            lstclsPosiblesClientes.add(obclsPosiblesClientes);
            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);

            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

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
