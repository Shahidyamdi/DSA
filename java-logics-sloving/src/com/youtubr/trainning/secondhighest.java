package com.youtubr.trainning;

import java.util.Arrays;
import java.util.List;

public class secondhighest {
	public static void main(String[] args) {
		List<Integer> secondhighest = Arrays.asList(1,5,8,3,5,4,10,12,15);
		Integer secondlargest = secondhighest.stream()
				.distinct()
				.sorted((a , b)->Integer.compare(b, a))
		        .skip(1)
		        .findFirst()
		        .orElse(null);
		System.out.println(secondlargest);
	}

}
