/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryapi_svb;


import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author balas
 */

public class Libro {


    private Long id;
    private String titulo;
    private String idioma;
    private LocalDate fechaPublicacion;
    private List<Autor> autores;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    
}
