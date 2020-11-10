package com.webapp.springLibrery1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.springLibrery1.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
