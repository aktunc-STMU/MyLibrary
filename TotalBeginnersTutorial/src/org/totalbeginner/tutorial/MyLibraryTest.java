package org.totalbeginner.tutorial;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {

	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;

	public void testMyLibrary() {
		MyLibrary m1 = new MyLibrary("Test");
		
		assertEquals("Test", m1.name);
		
		assertTrue(m1.books instanceof ArrayList);
		assertTrue(m1.people instanceof ArrayList);
	}
	
	public void setup() {
		
		b1 = new Book("Book1");
		b2 = new Book("Book2");
		
		p1 = new Person();
		p2 = new Person();
		
		p1.setName("Fred");
		p2.setName("Richard");
		
		ml = new MyLibrary("Test");
		
	}
	
	public void addItems() {
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
	}
	
	public void testAddBook() {
		//create test objects
		setup();
		
		//test initial size is 0
		assertEquals(0, ml.books.size());
		assertEquals(0, ml.people.size());
		
		ml.addBook(b1);
		ml.addBook(b2);
		
		//test that 2 books are added
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		
		//test that Book1 is removed
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));
		
		
	}
	
	public void testCheckOut() {
		setup();
		
		addItems();
		
		assertTrue(ml.checkOut(b1, p1));
		
		assertEquals("Fred", b1.getPerson().getName());
		
		assertFalse(ml.checkOut(b1, p2));
		
		assertTrue(ml.checkIn(b1));
		assertTrue(ml.checkOut(b1, p2));
		
		assertEquals("Richard", b1.getPerson().getName());
		
	}
	
	public void testgetCountOfBooks() {
		setup();
		
		addItems();
		p1.setMaximumBooks(2);
		
		ml.checkOut(b1, p1);
		ml.checkOut(b2, p1);
		
		assertEquals(2, ml.getCountOfBooks(p1));
	}
	
	
	public void testgetAvailableBooks() {
		
		setup();
		addItems();
		
		assertEquals(2, ml.getAvailableBooks().size());
		
		ml.checkOut(b1, p1);
		
		assertEquals(1, ml.getAvailableBooks().size());
		
	}
	

}
