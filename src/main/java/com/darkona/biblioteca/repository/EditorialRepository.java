package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Editorial;
import org.springframework.data.repository.CrudRepository;

public interface EditorialRepository extends CrudRepository<Editorial, Integer> {


    Editorial findEditorialById(Integer id);
}
