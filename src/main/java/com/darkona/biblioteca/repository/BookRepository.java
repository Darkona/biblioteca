package com.darkona.biblioteca.repository;

import com.darkona.biblioteca.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findLibroById(long id);
}
