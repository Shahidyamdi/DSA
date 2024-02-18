package com.java8;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String args[]) {
		List<Student> list = new ArrayList<Student>();

		// Adding Students
		list.add(new Student(1, "Nidhi"));
		list.add(new Student(3, "Parbhjot"));
		list.add(new Student(2, "Amani"));

		// using lambda to filter data
		Stream<Student> filtered_data = list.stream().filter(s -> s.rollNo > 0);

		// using lambda to iterate through collection
		filtered_data.forEach(student -> System.out.println(student.name));
		//filtered_data.collect(Collectors.toList());
		
	}
}
