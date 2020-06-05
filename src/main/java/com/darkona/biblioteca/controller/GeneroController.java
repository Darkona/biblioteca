package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Genero;
import com.darkona.biblioteca.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/Genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;


    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Genero detallesGenero(@PathVariable int  id){ return generoService.obtenerGeneroPorId(id);}

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Genero> todosLosGeneros(){
        return generoService.obtenerTodosLosGeneros();
    }

    @PostMapping(path = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Genero crearGenero(@RequestBody Genero genero){
        return generoService.crearGenero(genero);
    }

    @PutMapping("/{id}")
    public Genero modificarGenero (@PathVariable ("id") int id, @RequestBody Genero genero){

        if(generoService.obtenerGeneroPorId(id) != null){
            genero.setId(id);
            return generoService.modificarGenero(genero);
        }
        throw new ResourceNotFoundException();
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminarGenero(@PathVariable ("id") int id){return generoService.eliminarGenero(id) == null;}

}
