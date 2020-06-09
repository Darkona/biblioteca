package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Autor;

import java.util.List;

public interface AuthorService {
    Autor crearAutor(Autor autor);

    Autor obtenerAutorPorId(int id);

    List<Autor> obtenerTodosLosAutores();

    Autor modificarAutor(Autor a);

    Autor eliminarAutor(int id);
}
