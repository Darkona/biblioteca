package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Genre;

import java.util.List;

public interface GenreService {
    Genre crearGenero(Genre genre);

    Genre obtenerGeneroPorId(int id);

    List<Genre> obtenerTodosLosGeneros();

    Genre modificarGenero(Genre g);

    Genre eliminarGenero(int id);
}
