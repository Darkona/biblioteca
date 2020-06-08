package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("libro")
@Slf4j
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro bookDetails(@PathVariable Long id){
        log.info(String.format("Called with id %d", id));
        return libroService.getBookById(id);
    }

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> allBooks() {
        log.info("Called");
        return libroService.getAllBooks();
    }

    @GetMapping(path = "/list/titles")
    public List<String> allTitles() {
        log.info("Called");
        return libroService.getAllBookShort()
                .stream()
                .map(ViewModelLibroAutor::toString)
                .collect(Collectors.toList());
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro createBook(@RequestBody Libro libro) {
        log.info("Called");
        return libroService.createBook(libro);
    }


    @PutMapping(path = "/{id}")
    public Libro editBook(@PathVariable("id") Long id, @RequestBody Libro libro) {
        log.info("Called");
        if (libroService.getBookById(id) != null) {
            libro.setId(id);
            return libroService.editBook(libro);
        }
        throw new ResourceNotFoundException();
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteBook(@PathVariable("id") Long id) {
        log.info("Called");
        return libroService.deleteBook(id) == null;
    }
}
