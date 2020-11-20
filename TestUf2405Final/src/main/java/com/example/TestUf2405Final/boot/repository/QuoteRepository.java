package com.example.TestUf2405Final.boot.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.TestUf2405Final.boot.model.Quote;


public interface QuoteRepository extends CrudRepository<Quote, Long> {

	Quote findById(long id);
}