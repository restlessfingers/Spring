package com.example.TestUf2405Final.boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestUf2405Final.boot.model.Quote;
import com.example.TestUf2405Final.boot.repository.QuoteRepository;


@Service
public class QuoteService {

	@Autowired
	QuoteRepository repository;


	public Iterable<Quote> findAll() {

		return repository.findAll();
	}

	public void insertQuote (Quote quote) {

		repository.save(quote);
	}

}