package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Autor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping (value = "/author", produces = APPLICATION_JSON_VALUE)
public interface AuthorController {
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Autor authorDetails(@PathVariable int id);

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Autor> allAuthors();

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Autor createAuthor(@RequestBody Autor autor);

    @PutMapping("/{id}")
    Autor modifyAuthor(@PathVariable("id") int id, @RequestBody Autor autor);

    @DeleteMapping(path = "/{id}")
    boolean removeAuthor(@PathVariable("id") int id);
}
