package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapobject {
	public static void main(String[] args) {
		List<EMP> emps = Arrays.asList(new EMP(101, "ratan", 10000.45), new EMP(102, "anu", 20000.45),
				new EMP(103, "sarvya", 30000.45), new EMP(104, "chandu", 40000.45));

		emps.stream().map(e -> e.ename + " IT").forEach(name -> System.out.println(name));
		System.out.println("************************************");
		emps.stream().filter(e -> e.esal > 25000).map(e -> {
			e.setEsal(e.getEsal() + 1000);
			return e;
		}).forEach(e -> System.out.println(e));
		System.out.println("************************************");
		emps.stream().filter(e -> e.esal < 25000).map(e -> {
			e.setEname(e.getEname() + "addanki");
			return e;
		}).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}

}
