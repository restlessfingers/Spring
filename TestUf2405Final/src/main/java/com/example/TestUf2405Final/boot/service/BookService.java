package com.example.TestUf2405Final.boot.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.TestUf2405Final.boot.model.Book;
import com.example.TestUf2405Final.boot.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;

	public Iterable<Book> findAll() {

		return repository.findAll();
	}
	
	public void insertBook (Book book) {

		repository.save(book);
	}
	
	
	public Optional<Book> findById (long id) {

		return repository.findById(id);
	}

}