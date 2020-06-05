package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Autor;
import com.darkona.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping ("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Autor detallesAutor(@PathVariable int  id){ return autorService.obtenerAutorPorId(id);}

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Autor> todosLosAutores(){
        return autorService.obtenerTodosLosAutores();
    }

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Autor crearAutor(@RequestBody Autor autor){
        return autorService.crearAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor modificarAutor (@PathVariable ("id") int id, @RequestBody Autor autor){

        if(autorService.obtenerAutorPorId(id) != null){
            autor.setId(id);
            return autorService.modificarAutor(autor);
        }
        throw new ResourceNotFoundException();
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminarAutor(@PathVariable ("id") int id){return autorService.eliminarAutor(id) == null;}



}
