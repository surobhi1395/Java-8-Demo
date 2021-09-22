package com.functional.inteface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

	// for conditional check, return boolean results
	
	public static void main(String[] args) {
		
		Predicate<Integer> pre = (t) -> {
			if(t%2==0)
				return true;
			else
			    return false;
		};
      System.out.println(pre.test(7));
      
      
      List<Integer> list = Arrays.asList(1,2,3,4,5);
      list.stream().forEach(t-> System.out.println("Printing: " + t));
      
      list.stream().filter(pre).forEach(t-> System.out.println("Printing Even: " + t));
      
      
	}
	

}
