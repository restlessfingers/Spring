package com.example.TestUF2405;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuoteService {

	@Autowired
	QuoteRepository repository;
	
	
	public Iterable<Quote> findAll() {
		
		//return com.example.repository.findAll();
		return repository.findAll();
	}
	
	public void insertQuote(Quote quote) {
		
		repository.save(quote);
	}
	
	public void deleteQuote(Quote quote) {
		
		repository.delete(quote);
	}

}