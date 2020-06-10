package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    Author findAutorById(int id);
}
