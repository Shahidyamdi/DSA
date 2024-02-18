package com.java8;

import java.util.Arrays;
import java.util.List;

public class methodreference {
	public static void main(String[] args) {
		List<EMP> emps = Arrays.asList(new EMP(101, "ratan", 10000.45), new EMP(102, "anu", 20000.45),
				new EMP(103, "sarvya", 30000.45), new EMP(104, "chandu", 40000.45));
		
		emps.forEach(System.out::println);
	}

}
