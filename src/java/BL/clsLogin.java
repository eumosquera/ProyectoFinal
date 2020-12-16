/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bl;

import java.sql.DriverManager;
import java.sql.Connection;
public class clsLogin {
    Connection conn = null;
    
    public clsLogin(){
        clsConexion obclsConexion = new clsConexion();
        conn = obclsConexion.getConexion();
        
    }

    public boolean validarLogin(Models.ClsLogin obclsLogin) {
        try {
            return obclsLogin.getStEmail().equals("endermu28@gmail.com")
                    && obclsLogin.getStPassword().equals("0147");
        } catch (Exception ex) {
            throw ex;
        }
    }
    public String addUsuario(){
        try{
            
        }catch(Exception ex){
            throw ex;
            
        }
    }
}
