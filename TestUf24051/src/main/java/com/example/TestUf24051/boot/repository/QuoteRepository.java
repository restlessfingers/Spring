package com.example.TestUf24051.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.TestUf24051.boot.model.Quote;


public interface QuoteRepository extends CrudRepository<Quote,Long> {
	Quote findById(long id);
	
}