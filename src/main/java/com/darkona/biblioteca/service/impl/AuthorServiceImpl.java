package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Author;
import com.darkona.biblioteca.repository.AuthorRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements com.darkona.biblioteca.service.AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author crearAutor(Author author){
        if(author.getId() != null){
            author.setId(null);}
        return authorRepository.save(author);
    }

    @Override
    public Author obtenerAutorPorId(int id){ return authorRepository.findAutorById(id);}

    @Override
    public List<Author> obtenerTodosLosAutores(){
        List<Author> autores = (List<Author>) authorRepository.findAll();

        for(Author a : autores){
            a.setName(WordUtils.capitalize(a.getName()));
            a.setLastName(WordUtils.capitalize(a.getLastName()));
        }
        return autores;
    }

    @Override
    public Author modificarAutor(Author a){
        if(a.getId()!= null) {
           return authorRepository.save(a);
        }else{
            return new Author();
        }
    }

    @Override
    public Author eliminarAutor(int id){
        authorRepository.deleteById(id);
        return authorRepository.findAutorById(id);
    }



}
