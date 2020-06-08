package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.repository.LibroRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class LibroService {


    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {

        this.libroRepository = libroRepository;
    }

    public List<Libro> getAllBooks(){
        log.info("Called");
        log.trace("Calling repository.findAll");
        List<Libro> libros = (List<Libro>)libroRepository.findAll();
        log.trace("Obtained "+ libros.size() + " books: " + libros.toString());
        log.debug("Setting titles...");
        for(Libro l : libros){
            String titulo = WordUtils.capitalize(l.getTitulo());
            log.trace("Setting title: " + titulo + " to " + l.getTitulo());
            l.setTitulo(titulo);
        }
        log.trace("Returning all books with fixed titles");
        return libros;
    }


    public List<ViewModelLibroAutor> getAllBookShort(){
        List<Libro> libros = (List<Libro>)libroRepository.findAll();

        return libros
                .stream()
                .map(ViewModelLibroAutor::new)
                .collect(Collectors.toList());
    }

    public Libro createBook(Libro libro){
        if(libro.getId() != null)libro.setId(null);
        return libroRepository.save(libro);
    }

    public Libro editBook(Libro l){
        if(l.getId() != null)
            return libroRepository.save(l);
        else
            return new Libro();
    }

    public Libro getBookById(Long id) {
        return libroRepository.findLibroById(id);
    }

    public Libro deleteBook(Long id){
        libroRepository.deleteById(id);
        return libroRepository.findLibroById(id);
    }
}
