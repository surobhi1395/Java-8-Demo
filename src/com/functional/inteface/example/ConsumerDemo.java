package com.functional.inteface.example;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo{
	
	public static void main(String[] arg) {
		
		/*
		 * Consumer consumer = (t) -> { System.out.println("Printing: " + t); };
		 */
		
		// consumer.accept(10);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5); 
		list.stream().forEach(t -> System.out.println("Printing: " + t));
	}
	
}
