/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro11911125;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Compradores extends users{
    ArrayList<accesorios> comprador;
    int dinero;

    public Compradores() {
    }

    public Compradores(ArrayList<accesorios> comprador, int dinero, String usuario, String contraseña, int edad) {
        super(usuario, contraseña, edad);
        this.comprador = comprador;
        this.dinero = dinero;
    }

    public ArrayList<accesorios> getComprador() {
        return comprador;
    }

    public void setComprador(ArrayList<accesorios> comprador) {
        this.comprador = comprador;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
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
        return "Compradores{" + "comprador=" + comprador + ", dinero=" + dinero + '}';
    }
    
}
