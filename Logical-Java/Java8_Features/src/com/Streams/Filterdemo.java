package com.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filterdemo {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i <= 15; i++) {
			l1.add(i);
		}
		System.out.println(l1);

//		List<Integer> l2 = new ArrayList<>();
//
//		for (Integer k : l1) {
//			if (k % 2 == 0) {
//				l2.add(k);
//			}
//		}
//			System.out.println(l2);
		
		List<Integer> list = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println("count are : "+count);
		
		Comparator<Integer> c = (i1,i2)->i1.compareTo(i2);
		
		List<Integer> l2 = l1.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l2);
		
		
		Integer max = l1.stream().max(c).get();
		System.out.println("max : "+max);
		
		Integer min = l1.stream().min(c).get();
		System.out.println("min : "+min);

		

	}

}
