package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Author;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RequestMapping (value = "/author", produces = APPLICATION_XML_VALUE)
public interface AuthorController {
    @GetMapping(path = "/{id}")
    Author authorDetails(@PathVariable int id);

    @GetMapping(path = "/list")
    List<Author> allAuthors();

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE)
    Author createAuthor(@RequestBody Author author);

    @PutMapping("/{id}")
    Author modifyAuthor(@PathVariable("id") int id, @RequestBody Author author);

    @DeleteMapping(path = "/{id}")
    boolean removeAuthor(@PathVariable("id") int id);
}
