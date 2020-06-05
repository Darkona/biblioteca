package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.LibroAutor;
import com.darkona.biblioteca.service.LibroService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("libro")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {

        this.libroService = libroService;
    }


    @GetMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro detallesLibro(@PathVariable Long id){
        return libroService.obtenerLibroPorId(id);
    }

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> todosLibros() {

        return libroService.obtenerTodosLosLibros();
    }

    @GetMapping(path = "/list/titles")
    public List<String> todosTitulos() {

        return libroService.obtenerTitulosLibros()
                .stream()
                .map(LibroAutor::toString)
                .collect(Collectors.toList());
    }

    @PostMapping(path = "",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro crearLibro(@RequestBody Libro libro) {

        return libroService.crearLibro(libro);
    }


    @PutMapping(path = "/{id}")
    public Libro modificarLibro(@PathVariable("id") Long id, @RequestBody Libro libro) {

        if (libroService.obtenerLibroPorId(id) != null) {
            libro.setId(id);
            return libroService.modificarLibro(libro);
        }
        throw new ResourceNotFoundException();
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminarLibro(@PathVariable("id") Long id) {
        return libroService.eliminarLibro(id) == null;
    }
}
