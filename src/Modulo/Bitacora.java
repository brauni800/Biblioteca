/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

import java.util.ArrayList;

/**
 *
 * @author A11003001
 */
public class Bitacora {

    private ArrayList<Usuario> list;
    
    public Bitacora(String usuario, String pwd) {
        Usuario usr = new Usuario(usuario, pwd);
        this.list.add(usr);
    }

    /**
     * @return the list
     */
    public ArrayList<Usuario> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Usuario> list) {
        this.list = list;
    }
    
}
