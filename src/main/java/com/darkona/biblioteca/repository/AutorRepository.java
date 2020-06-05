package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Integer> {
    Autor findAutorById(int id);
}
