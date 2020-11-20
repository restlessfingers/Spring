package com.example.TestUf24051.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.TestUf24051.boot.model.Quote;
import com.example.TestUf24051.boot.service.QuoteService;
import com.example.TestUf24051.boot.service.BookService;

@Controller
@RequestMapping("/books")
public class QuoteController {

	@Autowired
	QuoteService service;
	
	@Autowired
	BookService serviceBook;

	@RequestMapping("/quotes")
	public String showQuotes(Model model) {

		model.addAttribute("library", service.findAll());
		return "books/quotes";
	}
	
	
	@RequestMapping("/newQuote")
	public String newQuote() {

		return "books/newQuote.html";
	}

	@RequestMapping("/insertQuote")
	public String insertQuote(Quote quote, Model model) {

		service.insertQuote(quote);
		
		model.addAttribute("quotes", service.findAll());

		return "books/quotes.html";
	}

	/*@RequestMapping("/deleteQuote")
	public String deleteQuote(@RequestParam("title") String tag, Model model) {

		Quote quote = new Quote();

		service.deleteQuote(quote);
		model.addAttribute("library", service.findAll());

		return "quotes/library.html";
	}*/
}