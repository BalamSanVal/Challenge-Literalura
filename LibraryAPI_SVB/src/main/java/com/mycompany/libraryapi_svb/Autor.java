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

public class Autor {

    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaMuerte;
    private List<Libro> libros;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaMuerte(LocalDate fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public void setLibros(<any> libros) {
        this.libros = libros;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaMuerte() {
        return fechaMuerte;
    }

    public <any> getLibros() {
        return libros;
    }

    
}
