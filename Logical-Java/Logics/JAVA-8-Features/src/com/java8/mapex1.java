package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class mapex1 {
	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(78, 43, 23, 33, 56, 43);

		marks.stream().map(mark -> mark + 2).forEach(mark -> System.out.println(mark));

		System.out.println("*********************************");
		List<String> names = Arrays.asList("shahid", "sameer", "shama");

		names.stream().map(name -> name + "IT").forEach(name -> System.out.println(name));
		System.out.println("*********************************");
		
	List<Integer> numbers = Arrays.asList(2,4,5,3,6,2,8);
	List<Integer> evenlist =	numbers.stream().filter(number ->number%2==0)
	.map(number -> number * 10)
	.collect(Collectors.toList());
	System.out.println(evenlist);

	System.out.println("*********************************");

	Set<Integer> evenset = numbers.stream().filter(number ->number%2==0)
			.map(number -> number * 10)
			.collect(Collectors.toSet());
			System.out.println(evenset);
	}

}
