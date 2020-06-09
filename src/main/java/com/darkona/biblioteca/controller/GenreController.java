package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Genero;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping(
        value = "genre",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public interface GenreController {
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Genero genreDetails(@PathVariable int id);

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Genero> allGenres();

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Genero CreateGenre(@RequestBody Genero genero);

    @PutMapping("/{id}")
    Genero modifyGenre(@PathVariable("id") int id, @RequestBody Genero genero);

    @DeleteMapping(path = "/{id}")
    boolean removeGenre(@PathVariable("id") int id);
}
