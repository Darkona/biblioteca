package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping(
        value = "book",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public interface BookController {

    @GetMapping(path ="/{id}")
    Book bookDetails(@PathVariable Long id);

    @GetMapping(path = "/list")
    List<Book> allBooks();

    @GetMapping(path = "/list/titles")
    List<String> allTitles();

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    Book createBook(@Valid @RequestBody Book book);

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Book editBook(@PathVariable("id") Long id, @RequestBody Book book);

    @DeleteMapping(path = "/{id}")
    boolean deleteBook(@PathVariable("id") Long id);
}
