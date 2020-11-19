package com.exemple.shopExemple.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exemple.shopExemple.boot.service.CreditCardService;
import com.exemple.shopExemple.boot.service.CustomerService;
import com.exemple.shopExemple.boot.model.CreditCard;


@Controller
@RequestMapping("/creditcards")
public class CreditCardController {

	@Autowired
	CreditCardService service;
	@Autowired
	CustomerService serviceCustomer;

	@RequestMapping("/show")
	public String showCreditCards (Model model) {

		model.addAttribute("cards", service.findAll());
		return "shopping/cards.html";
	}
	
	
	@RequestMapping("/addCreditCard")
	public String addCreditCard(Model model) {

		model.addAttribute("clients", serviceCustomer.findAll());
		
		return "shopping/addCard.html";
	}

	@RequestMapping("/insertCreditCard")
	public String insertCreditCard(CreditCard creditCard,Model model) {
		//@RequestParam("idCustomer") Long idCustomer
		service.insertCreditCard(creditCard);
		
		
		model.addAttribute("cards", service.findAll());
		return "shopping/cards.html";
	}
}