/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A11003001
 */
public class Usuario {
    private String user;
    private String contrasenia;

    public Usuario(String user, String contrasenia) {
        this.user = user;
        this.contrasenia = contrasenia;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public boolean verificarAutentificacion(ArrayList<Usuario> list, Bitacora bitacora){
        boolean band = false;
        for(int i = 0; i < list.size(); i++){
            if(this.user.equals(list.get(i).getUser())){
                if(this.contrasenia.equals(list.get(i).getContrasenia())){
                    
                    band = true;
                }else
                    System.out.println("La contrasenia es incorrecta");
            }else
                bitacora = new Bitacora(this.user, this.contrasenia);
        }
        return band;
    }

    @Override
    public String toString() {
        return "user=" + user + ", contrasenia=" + contrasenia;
    }
    
    public static void main(String[] args) {
        boolean band = false;
        int i = 0;
        Usuario usuario;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        Bitacora bitacora = null;
        listaUsuarios.add(new Usuario("pepe", "12345"));
        listaUsuarios.add(new Usuario("pancho", "54321"));
        listaUsuarios.add(new Usuario("pablito", "15243"));
        listaUsuarios.add(new Usuario("paco", "51423"));
        
        do{
            System.out.println("Ingrese un usuario");
            String usr = entrada.nextLine();
            System.out.println("Ingrese una contrasenia");
            String pwd = entrada.nextLine();

            usuario = new Usuario(usr, pwd);
            band = usuario.verificarAutentificacion(listaUsuarios, bitacora);
            i++;
        }while(!band && i < 3);
    }
    
}
