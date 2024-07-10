/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author balas
 */

import com.mycompany.libraryapi_svb.Libro;
import com.mycompany.libraryapi_svb.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/buscar")
    public List<Libro> buscarLibrosPorTitulo(@RequestParam String titulo) {
        return libroService.buscarLibrosPorTitulo(titulo);
    }

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/idioma")
    public List<Libro> listarLibrosPorIdioma(@RequestParam String idioma) {
        return libroService.listarLibrosPorIdioma(idioma);
    }
}
