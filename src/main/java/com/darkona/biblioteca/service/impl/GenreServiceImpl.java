package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Genre;
import com.darkona.biblioteca.repository.GenreRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements com.darkona.biblioteca.service.GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre crearGenero(Genre genre){
        if(genre.getId() != null){
            genre.setId(null);}
        return genreRepository.save(genre);
    }

    @Override
    public Genre obtenerGeneroPorId(int id){ return genreRepository.findGeneroById(id);}

    @Override
    public List<Genre> obtenerTodosLosGeneros(){
        List<Genre> genres = (List<Genre>) genreRepository.findAll();

        for(Genre g : genres){
            g.setName(WordUtils.capitalize(g.getName()));
        }
        return genres;
    }

    @Override
    public Genre modificarGenero(Genre g){
        if(g.getId()!= null) {
            return genreRepository.save(g);
        }else{
            return new Genre();
        }
    }

    @Override
    public Genre eliminarGenero(int id){
        genreRepository.deleteById(id);
        return genreRepository.findGeneroById(id);
    }


}
