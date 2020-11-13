package com.example.TestUF2405;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "BOOK")
@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
    private ArrayList<Quote> quotes;
   /* @ManyToOne
    @JoinColumn(name = "QUOTES")
    private Quote quote;
    
	public Book() {
		super();	
	}*/

    
public   Book() {}

public Book(Integer id, String title, ArrayList<Quote> quotes) {
	super();
	this.id = id;
	this.title = title;
	this.quotes = quotes;
}

public Book(Integer id, String name) {
		this.id = id;
		this.title = name;
	}

public Book(String name) {
		this.title = name;
	}

public ArrayList<Quote> getQuotes() {
	return quotes;
}

public void setQuote (ArrayList<Quote> quotes) {
	this.quotes = quotes;
}

public String toString(Quote quotes) {

		return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + quotes.getTag() + '}';
	}
}
