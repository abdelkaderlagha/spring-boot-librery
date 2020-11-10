package com.webapp.springLibrery1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.springLibrery1.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
