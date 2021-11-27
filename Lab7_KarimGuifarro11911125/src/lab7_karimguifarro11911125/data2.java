/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro11911125;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class data2 {
     private ArrayList<Compradores> lista = new ArrayList();
    private File archivo = null;
     public data2(String path) {
        archivo = new File(path);
    }

    public ArrayList<Compradores> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Compradores> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lista=" + lista + '}';
    }
      public void setData(Compradores p) {
        this.lista.add(p);
    }

    /**
     *
     * @throws IOException
     */
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Compradores t : lista) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                 bw.write(t.getEdad() + ";");
                   bw.write(t.getDinero() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new Compradores(sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
     
}
