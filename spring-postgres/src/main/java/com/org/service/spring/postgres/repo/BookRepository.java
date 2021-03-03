package com.org.service.spring.postgres.repo;

import org.springframework.data.repository.CrudRepository;

import com.org.service.spring.postgres.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository {

    List<Book> findByName(String name);

}
