package org.openknowledge.java.tutorial.jcf.harrypotter;

/**
 * 
 * Entity class representing a book
 * 
 */
public class Book {

	public Book(String bookName) {
		this.bookName = bookName;
	}

	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}