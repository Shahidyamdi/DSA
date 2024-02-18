package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapmethodreference {
	public static List<Integer> stringnumtointnum(List<String> number) {
		return number.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());

	}
	public static  List<Integer> stringlength (List<String> names){
		return names.stream()
				.map(String :: length)
				.collect(Collectors.toList());
		
	}
	
	public static  List<String> Uppernames (List<String> names){
		return names.stream()
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		
	}

	public static void main(String[] args) {

		List<String> StringNumbers = Arrays.asList("1", "2", "3", "4");
		List<Integer> list = mapmethodreference.stringnumtointnum(StringNumbers);
		System.out.println(list);
		System.out.println(":********************************************************");
		
		List<String> name = Arrays.asList("shahid", "Akbar", "sameer", "munny","shama");
		List<Integer> list2 = mapmethodreference.stringlength(name);
		System.out.println(list2);
		System.out.println(":********************************************************");
		
		
		List<String> lowernames = Arrays.asList("shahid", "Akbar", "sameer", "munny","shama");
		List<String> uppernames =mapmethodreference.Uppernames(lowernames);
		System.out.println(uppernames);
		System.out.println(":********************************************************");
		
		
		List<person> persons = Arrays.asList(new person(22, "ratan"),
				new person(18, "anu"));
		
		persons.stream().map(person :: newage)
		.forEach((age)->System.out.println(age));
		
	

		
		
	}

}
