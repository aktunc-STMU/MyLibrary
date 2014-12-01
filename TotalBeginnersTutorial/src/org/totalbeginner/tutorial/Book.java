package org.totalbeginner.tutorial;

public class Book {

	public String title;
	public String author;
	private Person person;

	public Book(String title) {
		this.title = title;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
		
	}

	public Person getPerson() {
		return this.person;
	}
	
	public String toString() {
		String availability;
		
		if(getPerson() == null) {
			availability = "available";
		}
		else {
			availability = "unavailable";
		}
		
		return getTitle() + " by " + getAuthor() + "; " + availability;
	}
	

	

}
