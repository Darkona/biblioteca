package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.AuthorController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Author;
import com.darkona.biblioteca.service.impl.AuthorServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AuthorControllerImpl implements AuthorController {

    @Autowired
    private AuthorServiceImpl autorService;

    @Override
    public Author authorDetails(int id) {
        log.info(String.format("Called method AuthorDetails by id: %d", id));
        return autorService.obtenerAutorPorId(id);
    }

    @Override
    public List<Author> allAuthors() {
        log.info("Called method allAuthors");
        return autorService.obtenerTodosLosAutores();
    }

    @Override
    public Author createAuthor(Author author) {
        log.info("Called method createAuthor");
        return autorService.crearAutor(author);
    }

    @Override
    public Author modifyAuthor(int id, Author author) {
        log.info(String.format("Called method  modifyAuthor by id: %d"),id);
        if (autorService.obtenerAutorPorId(id) != null) {
            log.info("Modified author");
            author.setId(id);
            return autorService.modificarAutor(author);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public boolean removeAuthor(int id) {
        log.info(String.format("Called method removeAuthor by id: %d", id));
        return autorService.eliminarAutor(id) == null;
    }


}
