/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Pelis {
    private int id;
    private String nombre;
    private String director;
    private String pais;
    private String clasificacion;
    private String annio;
    private boolean existencia;
    
    public Pelis(){
        
    }   

    public Pelis(int id, String nombre, String director, String pais, String clasificacion, String annio, boolean existencia) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.annio = annio;
        this.existencia = existencia;
    }

    public Pelis(String nombre, String director, String pais, String clasificacion, String annio, boolean existencia) {
        this.nombre = nombre;
        this.director = director;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.annio = annio;
        this.existencia = existencia;
    }

    public Pelis(String director, String pais, String clasificacion, String annio, boolean existencia) {
        this.director = director;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.annio = annio;
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAnnio() {
        return annio;
    }

    public void setAnnio(String annio) {
        this.annio = annio;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

}
