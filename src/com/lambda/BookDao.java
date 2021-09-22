package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getAllBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(101, "Core Java", 500));
		books.add(new Book(102, "Spring Framework", 300));
		books.add(new Book(103, "Hibernate", 700));
		books.add(new Book(104, "Web Services", 400));
		books.add(new Book(105, "Data Structure", 800));
		
		return books;
		
	}
	

}
