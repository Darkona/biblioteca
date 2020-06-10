package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Genre;
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
    Genre genreDetails(@PathVariable int id);

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Genre> allGenres();

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Genre CreateGenre(@RequestBody Genre genre);

    @PutMapping("/{id}")
    Genre modifyGenre(@PathVariable("id") int id, @RequestBody Genre genre);

    @DeleteMapping(path = "/{id}")
    boolean removeGenre(@PathVariable("id") int id);
}
