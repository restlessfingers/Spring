package com.example.TestUf24051.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter @Setter
@Entity
public class Book {
	// ...
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;


	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY,
          cascade = CascadeType.ALL)
	 @JsonIgnore
	private List<Quote> quotes;

	protected Book() {}

	public Book(Long id, String title) {
		this.id = id;
		this.title = title;
	}

	
	/*public Book(String title) {
		this.title = title;
	}*/

	@Override
	public String toString() {
		return String.format("Book[id=%d, id='%s', title='%s']", id, title);
	}


	public List<Quote> getQuote() {
		return quotes;
	}
	
	  public void setQuote(List<Quote> quotes) { 
		  this.quotes = quotes; }
	 
}