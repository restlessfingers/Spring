package com.example.BootH2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	private String title;
	private String ISBN;
	private int pages;
	private int year;
	private String author;

	
	public Book() {
		super();	
	}
	
	public Book(String title, String isbn, int pages, int year, String author) {
		super();
		this.title = title;
		ISBN = isbn;
		this.pages = pages;
		this.year = year;
		this.author = author;
	}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public Book(String title, String ISBN, int pages) {
		super();
		this.title = title;
		this.ISBN = ISBN;
		this.pages = pages;
	}

	

}
