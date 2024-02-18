package com.java8;

import java.util.Arrays;
import java.util.List;

public class Reduceex {
	public static void main(String[] args) {
		List<Integer> prices = List.of(56, 48, 28, 90, 20, 45);

		int r = prices.stream().reduce((i, j) -> i + j).get();
		System.out.println(r);

		List<String> names = Arrays.asList("raju", "rani", "deyam", "shahid", "devi", "ratan");
		String res = names.stream().filter(name -> (name.startsWith("r") || name.startsWith("d")) && name.length() == 4)
				.map(name -> name + "it").reduce((name1, name2) -> name1 + name2).get();
		System.out.println(res);

		List<Integer> numbers = Arrays.asList(2, 65, 4, 6, 88, 10, 66);
		int total = numbers.stream().filter(number -> number < 10).map(number -> number * 10)
				.reduce((number1, number2) -> number1 + number2).get();
		System.out.println(total);

	}

}
