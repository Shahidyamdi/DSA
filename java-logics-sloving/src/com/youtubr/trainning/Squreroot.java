package com.youtubr.trainning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squreroot {
	public static void main(String[] args) {
		List<Integer> sqrt = Arrays.asList(4,9,16,25,64);
		List<Double> collect = sqrt.stream()
		.map(Math::sqrt)
		.collect(Collectors.toList());
		System.out.println(collect);
	}

}
