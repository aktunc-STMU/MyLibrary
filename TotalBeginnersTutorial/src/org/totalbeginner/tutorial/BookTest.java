package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	
	public void testBook () {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
	
	public void testGetPerson() {
		Book b2 = new Book("Sideways");
		Person p2 = new Person();
		p2.setName("Miles");
		//method to tell book is loaned to this person
		b2.setPerson(p2);
		
		//get the name of the person who has the book
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
		
		String testName = b2.getPerson().getName();
		
		
		
		assertEquals("Miles", testName);
	}
	
	public void testGetBook() {
		Book b3 = new Book("The Great Gatsby");
		assertEquals("The Great Gatsby", b3.getTitle());
		
	}
	
	public void testToString() {
		
		Book b1 = new Book("Great Expectations");
		b1.setAuthor("Charles Dickens");
		
		assertEquals("Great Expectations by Charles Dickens; available", b1.toString());
		
	}

}
