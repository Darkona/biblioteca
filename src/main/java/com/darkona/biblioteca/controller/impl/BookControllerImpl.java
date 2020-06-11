package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.controller.BookController;
import com.darkona.biblioteca.exception.ResourceNotFoundException;
import com.darkona.biblioteca.model.Book;
import com.darkona.biblioteca.model.viewmodel.ViewModelBookAuthor;
import com.darkona.biblioteca.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    private BookService bookService;


    @Override
    public Book bookDetails(Long id) {

        log.info("Called with id %d", id);
        return bookService.getBookById(id);
    }

    @Override
    public List<Book> allBooks() {

        log.info("Called method allBooks");
        return bookService.getAllBooks();
    }

    @Override
    public List<String> allTitles() {

        log.info("Called method allTitles");
        return bookService.getAllBookShort()
                .stream()
                .map(ViewModelBookAuthor::toString)
                .collect(Collectors.toList());
    }

    @Override
    public Book createBook(Book book) {

        log.info("Called method createBook");
        return bookService.createBook(book);
    }


    @Override
    public Book editBook(Long id, Book book) {

        log.info(String.format("Called method editBook by id: %d", id));
        if (bookService.getBookById(id) != null) {
            book.setId(id);
            return bookService.editBook(book);
        }
        throw new ResourceNotFoundException();
    }

    @Override
    public boolean deleteBook(Long id) {

        log.info("Called method deleteBook by id: %d:", id);
        return bookService.deleteBook(id) == null;
    }
}
