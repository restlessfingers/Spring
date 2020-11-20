package com.example.TestUf2405Final.boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.example.TestUf2405Final.boot.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
	Optional<Book> findById(long id);
}