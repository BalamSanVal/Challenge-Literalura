/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryapi_svb.service;
import com.mycompany.libraryapi_svb.Libro;
import com.mycompany.libraryapi_svb.repository.LibroRepository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author balas
 */
@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        return libroRepository.findByTituloContaining(titulo);
    }

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public List<Libro> listarLibrosPorIdioma(String idioma) {
        return libroRepository.findByIdioma(idioma);
    }

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Libro> listarLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Libro> listarLibrosPorIdioma(String idioma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
