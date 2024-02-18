package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppertoLower {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("shahid");
		l1.add("sameer");
		l1.add("munny");
		l1.add("akbar");
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}

}
