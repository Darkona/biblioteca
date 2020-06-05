package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {


    Libro findLibroById(long id);


}
