/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.libraryapi_svb.repository;
import com.mycompany.libraryapi_svb.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author balas
 */
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContaining(String titulo);
    List<Libro> findByIdioma(String idioma);
}
