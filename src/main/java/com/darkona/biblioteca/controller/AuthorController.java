package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Author;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping (value = "/author", produces = APPLICATION_JSON_VALUE)
public interface AuthorController {
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Author authorDetails(@PathVariable int id);

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Author> allAuthors();

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Author createAuthor(@RequestBody Author author);

    @PutMapping("/{id}")
    Author modifyAuthor(@PathVariable("id") int id, @RequestBody Author author);

    @DeleteMapping(path = "/{id}")
    boolean removeAuthor(@PathVariable("id") int id);
}
