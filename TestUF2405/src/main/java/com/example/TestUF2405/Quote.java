package com.example.TestUF2405;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity
@Table(name = "QUOTE")

public class Quote {
	
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	private Book book;
		
	public Quote() {
		super();
	}
	public Quote(int id, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
	public String getTag() {
		return tag;
	}
	
	
	
public Quote(int id, String tag, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.tag = tag;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
public String getTag() {
		return tag;
	}
	public void setSentence(String tag) {
		this.tag = tag;
	}
	public int getNumberWords() {
		return numberWords;
	}
	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}*/
	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", numberWords=" + numberWords + ", book=" + book + "]";
	}

}
