package com.youtube.trainning;

import java.util.Arrays;

//{12,-13,-11,8,3,-8,-6,0,-5,2,4}

public class sorting_order {
	public static void main(String[] args) {

		int a[] = { 12, -13, -11, 8, 3, -8, -6, 0, -5, 2, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(a));
	}
}
