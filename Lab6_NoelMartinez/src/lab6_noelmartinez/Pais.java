/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noelmartinez;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author noelg
 */
public class Pais {
    private String nombre;
    private Date fecha_fundacion;
    private String himno;
    private Color bandera;

    public Pais() {
    }

    public Pais(String nombre, Date fecha_fundacion, String himno, Color bandera) {
        this.nombre = nombre;
        this.fecha_fundacion = fecha_fundacion;
        this.himno = himno;
        this.bandera = bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(Date fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getHimno() {
        return himno;
    }

    public void setHimno(String himno) {
        this.himno = himno;
    }

    public Color getBandera() {
        return bandera;
    }

    public void setBandera(Color bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
