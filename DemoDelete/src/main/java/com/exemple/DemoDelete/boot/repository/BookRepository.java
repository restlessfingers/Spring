package com.exemple.DemoDelete.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.exemple.DemoDelete.boot.model.Book;


public interface BookRepository extends CrudRepository<Book,String> {

	
}
