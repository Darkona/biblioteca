package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Editorial;
import com.darkona.biblioteca.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @PutMapping(path = "crearEditorial", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Editorial crearEditorial(@RequestBody Editorial e){
        return editorialService.crearEditorial(e);
    }

}
