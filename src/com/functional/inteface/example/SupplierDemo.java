package com.functional.inteface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{
	
	
	

	public static void main(String[] args) {
		Supplier<String> sd = ()-> "Inside Supplier Interface get()";
		
		System.out.println(sd.get());
		
		List<String> list = Arrays.asList("jshd", "sghd", "oisj", "kajs", "qjsj");
		System.out.println(list.stream().findAny().orElseGet(sd));
	}

	
}
