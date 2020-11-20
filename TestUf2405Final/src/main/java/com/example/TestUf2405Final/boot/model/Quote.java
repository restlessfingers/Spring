package com.example.TestUf2405Final.boot.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tag;
	private String sentence;
	private int numberWords;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "BOOK_ID_FK", nullable = true)

	
	private Book book;
	
	public Quote() {}
	
	
	public Quote(Long id, String tag, String sentence, int numberWords) {
		super();
		this.id = id;
		this.tag = tag;
		this.sentence = sentence;
		this.numberWords = numberWords;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", tag=" + tag + ", sentence=" + sentence
				+ ", numberWords=" + numberWords + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public String getSentence() {
		return sentence;
	}


	public void setSentence(String sentence) {
		this.sentence = sentence;
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
	}

	

}