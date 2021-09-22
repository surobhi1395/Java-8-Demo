package com.lambda;

import java.util.Collections;
import java.util.List;

public class BookService {
	
	//private BookDao bookDao;
	
	public List<Book> getBooksInSort(){
		List<Book> listBook = new BookDao().getAllBooks();
		Collections.sort(listBook, (o1, o2)-> o2.getName().compareTo(o1.getName()));
		return listBook;
	}
	
	public static void main(String[] args) {
		BookService bs = new BookService();
		System.out.println(bs.getBooksInSort());
	}

}


/* class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// for descending order reverse it. o2 compares with o1 
		return o1.getName().compareTo(o2.getName());
	}
}	
*/



	
