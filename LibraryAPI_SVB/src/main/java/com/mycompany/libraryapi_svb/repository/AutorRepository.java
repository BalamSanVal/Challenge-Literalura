/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryapi_svb.repository;
import com.mycompany.libraryapi_svb.Autor;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author balas
 */
public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByFechaMuerteIsNull();
    List<Autor> findByFechaNacimientoBetween(LocalDate inicio, LocalDate fin);

    public List<Autor> findByFechaNacimientoBetween(LocalDate inicio, LocalDate fin);

    public List<Autor> findByFechaNacimientoBetween(LocalDate inicio, LocalDate fin);

    public List<Autor> findByFechaMuerteIsNull();

    public List<Autor> findAll();
}
