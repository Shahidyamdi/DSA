package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortingex {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("pillka", "molaka", "chilaka", "palaka");
		Collections.sort(names);
		System.out.println(names);
		System.out.println("******************************");

		names.sort((name1, names2) -> name1.compareTo(names2));
		System.out.println(names);
		names.sort((name1, names2) -> 1 - name1.compareTo(names2));
		System.out.println(names);
		System.out.println("******************************");

		List<String> newnames = Arrays.asList("raja", "rani", "ratan", "anu", "chandu");
		newnames.stream().sorted().forEach((name) -> System.out.println(name));
		newnames.stream().sorted((name1, names2) -> 1 - name1.compareTo(names2))
				.forEach((name) -> System.out.println(name));
		System.out.println("******************************");
		newnames.stream().filter((name)->name.startsWith("r"))
		.sorted()
		.forEach((name)->System.out.println(name));
		
		System.out.println("******************************");
		newnames.stream().filter((name)->name.startsWith("r"))
		.sorted((name1,name2) ->-name1.compareTo(name2))
		.forEach((name)->System.out.println(name));


	}

}
