package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository <Genero, Integer> {

    Genero findGeneroById(int id);
}
