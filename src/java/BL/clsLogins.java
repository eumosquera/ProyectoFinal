/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author urrutia03
 */
public class clsLogins {

    public boolean validarLogins(Models.clsLogins obclsLogins) {
        try {

            return obclsLogins.getStEmail().equals("endermu28@gmail.com")
                    && obclsLogins.getStPassword().equals("0147");

        } catch (Exception ex) {
            throw ex;
        }
    }
}
