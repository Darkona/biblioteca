package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.model.Editorial;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping(value = "editorial", produces = APPLICATION_JSON_VALUE)
public interface EditorialController {
    //List
    @GetMapping("/list")
    List<Editorial> allEditorials();

    //Detail
    @GetMapping("/{id}")
    Editorial editorialDetails(@PathVariable Integer id);

    //Create
    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Editorial crearEditorial(@RequestBody Editorial e);

    //Modify
    @PutMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    Editorial modifyEditorial(@PathVariable() Integer id, @RequestBody Editorial e);

    //Delete
    @DeleteMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    boolean deleteEditorial(@PathVariable Integer id);
}
