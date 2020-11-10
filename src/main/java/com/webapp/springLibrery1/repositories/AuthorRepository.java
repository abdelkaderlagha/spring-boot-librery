package com.webapp.springLibrery1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.springLibrery1.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
