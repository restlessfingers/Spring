package com.example.TestUf2405Final.boot.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	// ...
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;


	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY,
          cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<Quote> quotes;

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Quote> getQuotes() {
		return quotes;
	}


	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}


	public Book() {}
	

	public Book(String title) {
		this.title = title;
		
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, title='%s']", id, title);
	}

	public Long getId() {
		return id;
	}


	public List<Quote> getQuote() {
		return quotes;
	}

	
	  public void setQuote(List<Quote> quotes) { 
		  this.quotes = quotes; }
	 


	public void setId(Long id) {
		this.id = id;
	}

}