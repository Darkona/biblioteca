package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Book;
import com.darkona.biblioteca.model.viewmodel.ViewModelBookAuthor;

import java.util.List;


public interface BookService {

    List<Book> getAllBooks();

    List<ViewModelBookAuthor> getAllBookShort();

    Book createBook(Book book);

    Book editBook(Book l);

    Book getBookById(Long id);

    Book deleteBook(Long id);
}
