package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.AuthorController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Autor;
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
    public Autor authorDetails(int id) {
        log.info(String.format("Called method AuthorDetails by id: %d", id));
        return autorService.obtenerAutorPorId(id);
    }

    @Override
    public List<Autor> allAuthors() {
        log.info("Called method allAuthors");
        return autorService.obtenerTodosLosAutores();
    }

    @Override
    public Autor createAuthor(Autor autor) {
        log.info("Called method createAuthor");
        return autorService.crearAutor(autor);
    }

    @Override
    public Autor modifyAuthor(int id, Autor autor) {
        log.info(String.format("Called method  modifyAuthor by id: %d"),id);
        if (autorService.obtenerAutorPorId(id) != null) {
            log.info("Modified author");
            autor.setId(id);
            return autorService.modificarAutor(autor);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public boolean removeAuthor(int id) {
        log.info("Called method removeAuthor");
        return autorService.eliminarAutor(id) == null;
    }


}
