package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Libro;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping(
        value = "libro",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public interface LibroController {

    @GetMapping(path ="/{id}")
    Libro bookDetails(@PathVariable Long id);

    @GetMapping(path = "/list")
    List<Libro> allBooks();

    @GetMapping(path = "/list/titles")
    List<String> allTitles();

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    Libro createBook(@Valid @RequestBody Libro libro);

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Libro editBook(@PathVariable("id") Long id, @RequestBody Libro libro);

    @DeleteMapping(path = "/{id}")
    boolean deleteBook(@PathVariable("id") Long id);
}
