package com.youtubr.trainning;

public class largestnumber {
	public static void main(String[] args) {
		int arr1[] = { 95, 20, 50, 40, 80, 70, 55 };
		int max = Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max)
				max = arr1[i];

		}
		System.out.println(max);

		//min=max;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min)
				min = arr1[i];

		}
		System.out.println(min);
	}

}
