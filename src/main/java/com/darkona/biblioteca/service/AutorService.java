package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Autor;
import com.darkona.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor crearAutor(Autor autor){
        return autorRepository.save(autor);
    }
}
