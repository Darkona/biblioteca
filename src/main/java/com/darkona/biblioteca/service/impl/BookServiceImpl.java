package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Book;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.repository.BookRepository;
import com.darkona.biblioteca.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks(){
        log.info("Called");
        log.trace("Calling repository.findAll");
        List<Book> books = (List<Book>) bookRepository.findAll();
        log.trace("Obtained "+ books.size() + " books: " + books.toString());
        log.debug("Setting titles...");
        for(Book l : books){
            String titulo = WordUtils.capitalize(l.getTitle());
            log.trace("Setting title: " + titulo + " to " + l.getTitle());
            l.setTitle(titulo);
        }
        log.trace("Returning all books with fixed titles");
        return books;
    }


    @Override
    public List<ViewModelLibroAutor> getAllBookShort(){
        List<Book> books = (List<Book>) bookRepository.findAll();

        return books
                .stream()
                .map(ViewModelLibroAutor::new)
                .collect(Collectors.toList());
    }

    @Override
    public Book createBook(Book book){
        if(book.getId() != null) book.setId(null);
        return bookRepository.save(book);
    }

    @Override
    public Book editBook(Book l){
        if(l.getId() != null)
            return bookRepository.save(l);
        else
            return new Book();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findLibroById(id);
    }

    @Override
    public Book deleteBook(Long id){
        bookRepository.deleteById(id);
        return bookRepository.findLibroById(id);
    }
}
