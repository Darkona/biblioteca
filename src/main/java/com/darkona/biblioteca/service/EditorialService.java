package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Editorial;
import com.darkona.biblioteca.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    public Editorial crearEditorial(Editorial e){
        return editorialRepository.save(e);
    }
}
