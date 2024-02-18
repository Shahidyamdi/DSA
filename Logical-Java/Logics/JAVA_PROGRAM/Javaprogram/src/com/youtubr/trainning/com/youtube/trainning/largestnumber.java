package com.youtube.trainning;

public class largestnumber {
	public static void main(String[] args) {
		int arr[] = { 95, 20, 50, 40, 80, 70, 55 };
	    int max = 0;
		int min =max;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		
		
		System.out.println(max);

		min=max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];

		}
		System.out.println(min);
	}

}
