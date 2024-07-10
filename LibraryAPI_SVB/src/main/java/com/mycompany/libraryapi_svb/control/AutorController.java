/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author balas
 */

import com.mycompany.libraryapi_svb.Autor;
import com.mycompany.libraryapi_svb.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @GetMapping("/vivos")
    public List<Autor> listarAutoresVivos() {
        return autorService.listarAutoresVivos();
    }

    @GetMapping("/periodo")
    public List<Autor> listarAutoresPorPeriodo(@RequestParam String inicio, @RequestParam String fin) {
        LocalDate fechaInicio = LocalDate.parse(inicio);
        LocalDate fechaFin = LocalDate.parse(fin);
        return autorService.listarAutoresPorPeriodo(fechaInicio, fechaFin);
    }
}
