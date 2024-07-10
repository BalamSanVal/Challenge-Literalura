/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author balas
 */
import com.mycompany.libraryapi_svb.Autor;
import com.mycompany.libraryapi_svb.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public List<Autor> listarAutoresVivos() {
        return autorRepository.findByFechaMuerteIsNull();
    }

    public List<Autor> listarAutoresPorPeriodo(LocalDate inicio, LocalDate fin) {
        return autorRepository.findByFechaNacimientoBetween(inicio, fin);
    }
}
