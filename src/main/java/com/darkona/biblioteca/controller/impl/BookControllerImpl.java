package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.BookController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Book;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    private LibroService libroService;


    @Override
    public Book bookDetails(Long id) {

        log.info("Called with id %d", id);
        return libroService.getBookById(id);
    }

    @Override
    public List<Book> allBooks() {

        log.info("Called method allBooks");
        return libroService.getAllBooks();
    }

    @Override
    public List<String> allTitles() {

        log.info("Called method allTitles");
        return libroService.getAllBookShort()
                .stream()
                .map(ViewModelLibroAutor::toString)
                .collect(Collectors.toList());
    }

    @Override
    public Book createBook(Book book) {

        log.info("Called method createBook");
        return libroService.createBook(book);
    }


    @Override
    public Book editBook(Long id, Book book) {

        log.info(String.format("Called method editBook by id: %d", id));
        if (libroService.getBookById(id) != null) {
            book.setId(id);
            return libroService.editBook(book);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public boolean deleteBook(Long id) {

        log.info("Called method deleteBook by id: %d:", id);
        return libroService.deleteBook(id) == null;
    }
}
