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
public class accesorios {
    String id,nombre;
    int cantid,precio;

    public accesorios() {
    }

    public accesorios(String id, String nombre, int cantid, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantid = cantid;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantid() {
        return cantid;
    }

    public void setCantid(int cantid) {
        this.cantid = cantid;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "accesorios{" + "id=" + id + ", nombre=" + nombre + ", cantid=" + cantid + ", precio=" + precio + '}';
    }

     
}
