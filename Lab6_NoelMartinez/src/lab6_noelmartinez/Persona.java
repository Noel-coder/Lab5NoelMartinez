/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noelmartinez;

/**
 *
 * @author noelg
 */
public class Persona {
    private String nacionalidad;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String vocacion;
    private String titulo;
    private String coronaVirus;

    public Persona() {
    }

    public Persona(String nacionalidad, String nombre, String apellido, int edad, String genero, String vocacion, String titulo, String coronaVirus) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.vocacion = vocacion;
        this.titulo = titulo;
        this.coronaVirus = coronaVirus;
    }

    public Persona(String nacionalidad, String nombre, String apellido, int edad) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

   
    

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCoronaVirus() {
        return coronaVirus;
    }

    public void setCoronaVirus(String coronaVirus) {
        this.coronaVirus = coronaVirus;
    }

    @Override
    public String toString() {
        return nombre + " "+apellido;
    }
    
}
