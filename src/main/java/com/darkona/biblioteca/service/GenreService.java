package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Genero;

import java.util.List;

public interface GenreService {
    Genero crearGenero(Genero genero);

    Genero obtenerGeneroPorId(int id);

    List<Genero> obtenerTodosLosGeneros();

    Genero modificarGenero(Genero g);

    Genero eliminarGenero(int id);
}
