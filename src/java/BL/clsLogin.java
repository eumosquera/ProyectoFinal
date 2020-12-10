/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bl;

/**
 *
 * @author 57318
 */
public class clsLogin {

    public boolean validarLogin(Models.ClsLogin obclsLogin) {
        try {
            return obclsLogin.getStEmail().equals("endermu28@gmail.com")
                    && obclsLogin.getStPassword().equals("0147");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
