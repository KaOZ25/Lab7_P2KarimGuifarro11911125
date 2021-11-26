/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro11911125;

/**
 *
 * @author karim
 */
public class administradores extends users{

    public administradores() {
    }

    public administradores(String usuario, String contraseña, int edad) {
        super(usuario, contraseña, edad);
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
        return "administradores{" + super.toString();
    }
    
}
