package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.LibroController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.service.LibroService;
import com.darkona.biblioteca.service.impl.LibroServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class LibroControllerImpl implements LibroController {

    @Autowired
    private LibroService libroService;


    public Libro bookDetails(Long id) {

        log.info("Called with id %d", id);
        return libroService.getBookById(id);
    }

    public List<Libro> allBooks() {

        log.info("Called");
        return libroService.getAllBooks();
    }

    public List<String> allTitles() {

        log.info("Called");
        return libroService.getAllBookShort()
                .stream()
                .map(ViewModelLibroAutor::toString)
                .collect(Collectors.toList());
    }

    public Libro createBook(Libro libro) {

        log.info("Called");
        return libroService.createBook(libro);
    }


    public Libro editBook(Long id, Libro libro) {

        log.info("Called");
        if (libroService.getBookById(id) != null) {
            libro.setId(id);
            return libroService.editBook(libro);
        }
        throw new ResourceNotFoundException();
    }

    public boolean deleteBook(Long id) {

        log.info("Called");
        return libroService.deleteBook(id) == null;
    }
}
