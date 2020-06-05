package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Libro;
import com.darkona.biblioteca.model.viewmodel.ViewModelLibroAutor;
import com.darkona.biblioteca.repository.LibroRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {


    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {

        this.libroRepository = libroRepository;
    }

    public List<Libro> obtenerTodosLosLibros(){
        List<Libro> libros = (List<Libro>)libroRepository.findAll();
        for(Libro l : libros){
            l.setTitulo(WordUtils.capitalize(l.getTitulo()));
        }
        return libros;
    }


    public List<ViewModelLibroAutor> obtenerTitulosLibros(){
        List<Libro> libros = (List<Libro>)libroRepository.findAll();

        return libros
                .stream()
                .map(ViewModelLibroAutor::new)
                .collect(Collectors.toList());
    }

    public Libro crearLibro(Libro libro){
        if(libro.getId() != null)libro.setId(null);
        return libroRepository.save(libro);
    }

    public Libro modificarLibro(Libro l){
        if(l.getId() != null)
            return libroRepository.save(l);
        else
            return new Libro();
    }

    public Libro obtenerLibroPorId(Long id) {
        return libroRepository.findLibroById(id);
    }

    public Libro eliminarLibro(Long id){
        libroRepository.deleteById(id);
        return libroRepository.findLibroById(id);
    }
}
