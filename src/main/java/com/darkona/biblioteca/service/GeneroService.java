package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Genero;
import com.darkona.biblioteca.repository.GeneroRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public Genero crearGenero(Genero genero){
        if(genero.getId() != null){genero.setId(null);}
        return generoRepository.save(genero);
    }

    public Genero obtenerGeneroPorId(int id ){ return generoRepository.findGeneroById(id);}

    public List<Genero> obtenerTodosLosGeneros(){
        List<Genero> generos = (List<Genero>)generoRepository.findAll();

        for(Genero g : generos){
            g.setNombre(WordUtils.capitalize(g.getNombre()));
        }
        return generos;
    }

    public Genero modificarGenero(Genero g){
        if(g.getId()!= null) {
            return generoRepository.save(g);
        }else{
            return new Genero();
        }
    }

    public Genero eliminarGenero(int id){
        generoRepository.deleteById(id);
        return generoRepository.findGeneroById(id);
    }


}
