package com.bharath.javaprogram.simple;

import java.util.HashSet;
import java.util.Set;

public class Missingnumber {
	public static void main(String[] args) {
		Integer[] a = { 0, 2, 1, 6, 5 };
		Missingnumber(a);

	}

	public static void Missingnumber(Integer[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		int n = arr.length + 1;
		for (int i = 0; i <= n; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}

		}
	}

}
