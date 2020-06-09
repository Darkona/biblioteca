package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Autor;
import com.darkona.biblioteca.repository.AutorRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements com.darkona.biblioteca.service.AuthorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor crearAutor(Autor autor){
        if(autor.getId() != null){autor.setId(null);}
        return autorRepository.save(autor);
    }

    @Override
    public Autor obtenerAutorPorId(int id){ return autorRepository.findAutorById(id);}

    @Override
    public List<Autor> obtenerTodosLosAutores(){
        List<Autor> autores = (List<Autor>)autorRepository.findAll();

        for(Autor a : autores){
            a.setNombre(WordUtils.capitalize(a.getNombre()));
            a.setApellido(WordUtils.capitalize(a.getApellido()));
        }
        return autores;
    }

    @Override
    public Autor modificarAutor(Autor a){
        if(a.getId()!= null) {
           return autorRepository.save(a);
        }else{
            return new Autor();
        }
    }

    @Override
    public Autor eliminarAutor(int id){
        autorRepository.deleteById(id);
        return autorRepository.findAutorById(id);
    }



}