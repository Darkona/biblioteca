package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Author;

import java.util.List;

public interface AuthorService {
    Author crearAutor(Author author);

    Author obtenerAutorPorId(int id);

    List<Author> obtenerTodosLosAutores();

    Author modificarAutor(Author a);

    Author eliminarAutor(int id);
}
