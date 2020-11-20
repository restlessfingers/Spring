package com.example.TestUf24051.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.TestUf24051.boot.model.Book;


public interface BookRepository extends CrudRepository<Book,Long> {

	List<Book> findByTitle(String title);

	Book findById(long id);
}