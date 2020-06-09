package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.GenreController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Genero;
import com.darkona.biblioteca.service.impl.GenreServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class GenreControllerImpl implements GenreController {

    @Autowired
    private GenreServiceImpl generoService;


    @Override
    public Genero genreDetails(int id) {
        log.info(String.format("Called gender with id: %d", id));
        return generoService.obtenerGeneroPorId(id);
    }

    @Override
    public List<Genero> allGenres() {
        log.info("called method allGenres");
        return generoService.obtenerTodosLosGeneros();
    }

    @Override
    public Genero CreateGenre(Genero genero) {
        log.info("Called method createGenre");
        return generoService.crearGenero(genero);
    }

    @Override
    public Genero modifyGenre(int id, Genero genero) {
        log.info(String.format("Called method modifyGenre by id: %d", id));
        if (generoService.obtenerGeneroPorId(id) != null) {
            log.info("Genre modified");
            genero.setId(id);
            return generoService.modificarGenero(genero);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public boolean removeGenre(int id) {
        log.info("Called method removeGenre ");
        return generoService.eliminarGenero(id) == null;
    }

}
