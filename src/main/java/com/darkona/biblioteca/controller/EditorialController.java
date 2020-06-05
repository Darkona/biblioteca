package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Editorial;
import com.darkona.biblioteca.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("editorial")
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    //List
    @GetMapping("/list")
    public List<Editorial> listarEditoriales() {

        return editorialService.listarEditoriales();
    }

    //Detail
    @GetMapping("/{id}")
    public Editorial deatilsEditorial(@PathVariable Integer id) {

        return editorialService.mostrarEditorial(id);
    }

    //Create
    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Editorial crearEditorial(@RequestBody Editorial e) {

        return editorialService.crearEditorial(e);
    }

    //Modify
    @PutMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Editorial modifyEditorial(@PathVariable() Integer id, @RequestBody Editorial e) {

        return editorialService.modificarEditorial(id, e);

    }

    //Delete
    @DeleteMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public boolean deleteEditorial(@PathVariable Integer id){
        return editorialService.deleteEditorial(id) == null;
    }

}
