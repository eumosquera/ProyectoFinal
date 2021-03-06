/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 57318
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        if(request.getParameter("btnAutenticar")!=null) {
           btnAutenticar(request, response);

        }else if(request.getParameter("btnRegistrar")!=null){
            
        }

    }
    public void btnRegistrar(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException{
        try{
            
            
            
        }catch(Exception ex){
            request.setAttribute("stMensage", ex.getMessage());
            request.setAttribute("stTipo", "error");
            
            request.getRequestDispatcher("Registrar.jsp").forward(request, response);
        }
        
    }

    public void btnAutenticar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            String stMensaje = "";

            if (request.getParameter("txtEmail").equals("")) {
                stMensaje += "No se ingresó correo!";
            }
            if (request.getParameter("txtPassword").equals("")) {
                stMensaje += "No se ingresó contraseña!";
            }

            if (!stMensaje.equals("")) {
                throw new Exception(stMensaje.substring(0, stMensaje.length() - 1));
            }

            Models.ClsLogin obclsLogin = new Models.ClsLogin();

            obclsLogin.setStEmail(request.getParameter("txtEmail").toString());
            obclsLogin.setStPassword(request.getParameter("txtPassword").toString());

            Bl.clsLogin obBlclsLogin = new Bl.clsLogin();

            boolean blBandera = obBlclsLogin.validarLogin(obclsLogin);

            if (blBandera) {
                request.getRequestDispatcher("Index.jsp").forward(request, response);
            } else {
                throw new Exception("Correo o contrseña invalido");
            }

        } catch (Exception ex) {
            request.setAttribute("stError", ex.getMessage());
            request.getRequestDispatcher("Login.jsp").forward(request, response);
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
