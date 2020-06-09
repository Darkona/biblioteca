package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Genero;
import com.darkona.biblioteca.repository.GeneroRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements com.darkona.biblioteca.service.GenreService {

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public Genero crearGenero(Genero genero){
        if(genero.getId() != null){genero.setId(null);}
        return generoRepository.save(genero);
    }

    @Override
    public Genero obtenerGeneroPorId(int id){ return generoRepository.findGeneroById(id);}

    @Override
    public List<Genero> obtenerTodosLosGeneros(){
        List<Genero> generos = (List<Genero>)generoRepository.findAll();

        for(Genero g : generos){
            g.setNombre(WordUtils.capitalize(g.getNombre()));
        }
        return generos;
    }

    @Override
    public Genero modificarGenero(Genero g){
        if(g.getId()!= null) {
            return generoRepository.save(g);
        }else{
            return new Genero();
        }
    }

    @Override
    public Genero eliminarGenero(int id){
        generoRepository.deleteById(id);
        return generoRepository.findGeneroById(id);
    }


}
