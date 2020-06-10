package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository <Genre, Integer> {

    Genre findGeneroById(int id);
}
