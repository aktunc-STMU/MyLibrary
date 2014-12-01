package org.totalbeginner.tutorial;

public class Person {
	
	private String name;	//name of the person
	private int maximumBooks;	//most books the person can checkout
	
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void	setName(String name) {
		this.name = name;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}
	

}
