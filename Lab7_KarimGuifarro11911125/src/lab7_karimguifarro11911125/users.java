/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro11911125;


public class users {
    String usuario,contraseña;
    int edad;

    public users() {
    }

    public users(String usuario, String contraseña, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "users{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + '}';
    }
    
}
