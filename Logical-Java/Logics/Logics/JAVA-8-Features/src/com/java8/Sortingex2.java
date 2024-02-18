package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortingex2 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(5, 4, 3, 7, 8, 23, 54, 45, 67, 34);
		Collections.sort(number);
		System.out.println(number);
		System.out.println("******************************");

		number.sort((num1, num2) -> num1.compareTo(num2));
		System.out.println(number);
		number.sort((num1, num2) -> -num1.compareTo(num2));
		System.out.println(number);
		System.out.println("******************************");

		number.stream().sorted().forEach((num) -> System.out.print(num));
		System.out.println("******************************");
		number.stream().sorted((num1, num2) -> - num1.compareTo(num2))
				.forEach((num) -> System.out.print(num));
		System.out.println("******************************");
		
		  number.stream().filter((num) -> num <=10).map((num)-> num*10)
		 .sorted().forEach((name) -> System.out.println(name));
		  System.out.println("******************************");
		  
		  number.stream().filter((num) -> num <=10).map((num)-> num*10)
			 .sorted((num1,num2 )-> -num1.compareTo(num2)).forEach((name) -> System.out.println(name));
			  
		
	}

}
