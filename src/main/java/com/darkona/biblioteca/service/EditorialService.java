package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Editorial;
import com.darkona.biblioteca.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    public Editorial crearEditorial(Editorial e) {

        return editorialRepository.save(e);
    }

    public void eliminarEditorial(Integer id) {

        editorialRepository.deleteById(id);
    }

    public List<Editorial> listarEditoriales() {

        return (List<Editorial>) editorialRepository.findAll();
    }

    public Editorial mostrarEditorial(Integer id) {

        return editorialRepository.findEditorialById(id);
    }

    public Editorial modificarEditorial(Integer id, Editorial e) {

        e.setId(id);
        return editorialRepository.save(e);
    }

    public Editorial deleteEditorial(Integer id) {

        editorialRepository.deleteById(id);
        return editorialRepository.findEditorialById(id);

    }
}
