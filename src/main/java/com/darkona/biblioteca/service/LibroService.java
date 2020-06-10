package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Book;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;

import java.util.List;


public interface LibroService {

    List<Book> getAllBooks();

    List<ViewModelLibroAutor> getAllBookShort();

    Book createBook(Book book);

    Book editBook(Book l);

    Book getBookById(Long id);

    Book deleteBook(Long id);
}
