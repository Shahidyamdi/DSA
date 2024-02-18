package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Reduce_methodReference {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 5, 8, 6);
		Integer list1 = numbers.stream().reduce((x, y) -> x + y).get();
		System.out.println("Sum of number  " + list1);

		numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);
		numbers.stream().reduce(Integer::min).ifPresent(System.out::println);
		numbers.stream().reduce(Integer::max).ifPresent(System.out::println);
		
		
		
		List<String> names = List.of("shahid" ,"Sameer","shama","munny","akbar");
		names.stream().reduce(String :: concat).ifPresent(System.out::println);
		
		
		List<String> fruits = Arrays.asList("","","mango" ,"orange","bannana","apple","grapes");
		
		long count = fruits.stream().filter(String::isEmpty).count();
		System.out.println(count);
		
		fruits.stream().filter(Predicate.not(String ::isEmpty))
		.map(String::length).reduce(Integer::sum).ifPresent(System.out::println);
		
		
		
	}

}
