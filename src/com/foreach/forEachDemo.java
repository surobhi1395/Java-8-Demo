package com.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class forEachDemo {

	public static void main(String[] args) {
		
		// filter ---- conditional check
		List<String> names = new ArrayList<>();
		names.add("Riya");
		names.add("Arjun");
		names.add("Neha");
		names.add("Pooja");
		names.add("Arya");
		names.add("Sia");
		for(String s : names) {
			if(s.startsWith("A")) {
				System.out.println(s);
			}
		}
		names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		
		
		List<String> strings = new ArrayList<>();
		strings.add("siva");
		strings.add("rahul");
		strings.add("nihaal");
		strings.add("roy");
		strings.add("varun");
		strings.add("amit");
		
		for(String s : strings) {
			System.out.println(s);
		}
		System.out.println("List With Stream forEach api");
		strings.stream().forEach(t->System.out.println(t));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "a");
		map.put(102, "b");
		map.put(103, "c");
		map.put(104, "d");
		map.put(105, "e");
		
		map.forEach((key, value)->System.out.println(key + " : " + value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		Consumer<String> consumer = (t)-> System.out.println(t);
		consumer.accept("Surobhi Bose");
		
		
	}

}
