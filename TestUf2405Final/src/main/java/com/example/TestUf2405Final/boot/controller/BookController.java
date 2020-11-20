package com.example.TestUf2405Final.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TestUf2405Final.boot.model.Quote;
import com.example.TestUf2405Final.boot.model.Book;
import com.example.TestUf2405Final.boot.service.BookService;


@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService service;

	@RequestMapping("/show")
	public String showCusotmers(Model model) {

		model.addAttribute("books", service.findAll());
		return "library/books.html";
	}
	
	@RequestMapping("/addBook")
	public String addBook (Model model) {
		
		return "library/addBook.html";
	}

	@RequestMapping("/insertBook")
	public String insertCreditCard(Book book,Model model) {
		
		service.insertBook(book);
			
		model.addAttribute("books", service.findAll());
		return "library/books.html";
	}
	
	
}