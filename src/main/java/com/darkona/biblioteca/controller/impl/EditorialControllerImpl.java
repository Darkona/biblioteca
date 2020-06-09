package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.model.Editorial;
import com.darkona.biblioteca.service.impl.EditorialServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class EditorialControllerImpl implements com.darkona.biblioteca.controller.EditorialController {

    @Autowired
    private EditorialServiceImpl editorialService;

    //List
    @Override
    public List<Editorial> allEditorials() {

        log.info("Called method allEditorials");
        return editorialService.listarEditoriales();
    }

    //Detail
    @Override
    public Editorial editorialDetails(Integer id) {
        log.info(String.format("Called method editorialDetails by id: %d", id));
        return editorialService.mostrarEditorial(id);
    }

    //Create
    @Override
    public Editorial crearEditorial( Editorial e) {
        log.info("Called method createEditorial");
        return editorialService.crearEditorial(e);
    }

    //Modify
    @Override

    public Editorial modifyEditorial(Integer id, Editorial e) {
        log.info("Called method modifyEditorial");
        return editorialService.modificarEditorial(id, e);

    }

    //Delete
    @Override
    public boolean deleteEditorial(Integer id){
        log.info("called method deleteEditorial");
        return editorialService.deleteEditorial(id) == null;
    }

}
