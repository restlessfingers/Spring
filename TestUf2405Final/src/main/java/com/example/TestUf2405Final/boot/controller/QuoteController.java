package com.example.TestUf2405Final.boot.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TestUf2405Final.boot.service.QuoteService;
import com.example.TestUf2405Final.boot.service.BookService;
import com.example.TestUf2405Final.boot.model.Quote;
import com.example.TestUf2405Final.boot.model.Book;



@Controller
@RequestMapping("/quotes")
public class QuoteController {

	@Autowired
	QuoteService service;
	//@Autowired
	@Autowired
	BookService serviceBook;

	@RequestMapping("/show")
	public String showQuotes (Model model) {

		model.addAttribute("quotes", service.findAll());
		return "library/quotes.html";
	}
	
	
	@RequestMapping("/addQuote")
	public String addQuote(Model model) {
		
		model.addAttribute("books", serviceBook.findAll());
		
		return "library/addQuote.html";
	}

	//@RequestMapping("/insertQuote")
	@RequestMapping(value = "/insertQuote", method = RequestMethod.POST)

	public String insertQuote(Quote creditCard, Model model,
			 @RequestParam("idBook") Long id) {
		
		System.out.println(id);
		
		Optional<Book> foundBook = serviceBook.findById(id);
	

		// Search for a book with an invalid ID
		
		if (foundBook.isPresent()) creditCard.setBook(foundBook.get());
		else creditCard.setBook(null);
		
		service.insertQuote(creditCard);
		
		
		model.addAttribute("quotes", service.findAll());
		return "library/quotes.html";
	}
}