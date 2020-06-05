package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Autor;
import com.darkona.biblioteca.repository.AutorRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor crearAutor(Autor autor){
        if(autor.getId() != null){autor.setId(null);}
        return autorRepository.save(autor);
    }

    public Autor obtenerAutorPorId(int id ){ return autorRepository.findAutorById(id);}

    public List<Autor> obtenerTodosLosAutores(){
        List<Autor> autores = (List<Autor>)autorRepository.findAll();

        for(Autor a : autores){
            a.setNombre(WordUtils.capitalize(a.getNombre()));
            a.setApellido(WordUtils.capitalize(a.getApellido()));
        }
        return autores;
    }

    public Autor modificarAutor(Autor a){
        if(a.getId()!= null) {
           return autorRepository.save(a);
        }else{
            return new Autor();
        }
    }

    public Autor eliminarAutor(int id){
        autorRepository.deleteById(id);
        return autorRepository.findAutorById(id);
    }



}
