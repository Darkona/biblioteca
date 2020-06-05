package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Autor;
import com.darkona.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PutMapping(path = "crearAutor", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Autor crearAutor(@RequestBody Autor autor){
        return autorService.crearAutor(autor);
    }
}
