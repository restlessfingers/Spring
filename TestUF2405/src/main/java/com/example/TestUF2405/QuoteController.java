package com.example.TestUF2405;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quotes")
public class QuoteController {

	@Autowired
	QuoteService service;

	@RequestMapping("/library")
	public String showQuotes(Model model) {

		model.addAttribute("library", service.findAll());
		return "quotes/library";
	}
	
	
	@RequestMapping("/newQuote")
	public String newQuote() {

		return "quotes/newQuote.html";
	}

	@RequestMapping("/insertQuote")
	public String insertQuote(Quote quote, Model model) {

		service.insertQuote(quote);
		model.addAttribute("library", service.findAll());

		return "quotes/library.html";
	}

	@RequestMapping("/deleteQuote")
	public String deleteQuote(@RequestParam("title") String tag, Model model) {

		Quote quote = new Quote();

		service.deleteQuote(quote);
		model.addAttribute("library", service.findAll());

		return "quotes/library.html";
	}
}