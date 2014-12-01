package org.totalbeginner.tutorial; //Tutorial for using JUnit under Eclipse

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		books.add(b1);

	}
	
	public void addPerson(Person p1) {
		people.add(p1);
	}

	public void removeBook(Book b1) {
		books.remove(b1);

	}

	public boolean checkOut(Book b1, Person p1) {
		if ((b1.getPerson() == null) && (getCountOfBooks(p1) < p1.getMaximumBooks())) {
			b1.setPerson(p1);
			return true;
		} else {
			return false;

		}
	}
	
	public boolean checkIn(Book b1) {
		if(b1.getPerson() != null) {
			b1.setPerson(null);
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getCountOfBooks(Person p1) {
		
		int count = 0;
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getPerson() == p1) {
				count++;
			}
		}
		
		return count;
	}
	
	public ArrayList<Book> getAvailableBooks() {
		
		ArrayList<Book> notChecked = new ArrayList<Book>();
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getPerson() == null) {
				notChecked.add(books.get(i));
			}
		}
		
		return notChecked;
		
	}

}
