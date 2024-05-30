package com.bharath.javaprogram.simple;

import java.util.Arrays;
import java.util.List;

public class nameFilter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Akbar","sameer","shahid","munny");
		list.stream().filter(name->name.startsWith("s")).forEach(System.out::println);
	}

}
