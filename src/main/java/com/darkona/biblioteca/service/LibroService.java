package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LibroService {

    List<Libro> getAllBooks();

    List<ViewModelLibroAutor> getAllBookShort();

    Libro createBook(Libro libro);

    Libro editBook(Libro l);

    Libro getBookById(Long id);

    Libro deleteBook(Long id);
}
