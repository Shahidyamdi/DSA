package com.youtube.trainning;

public class second_smallestnumber {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 9, 1, 7, 3, 8 }; // Replace this array with your own

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (number < smallest) {
				secondSmallest = smallest;
				smallest = number;
			} else if (number < secondSmallest && number != smallest) {
				secondSmallest = number;
			}
		}

		System.out.println("Second smallest element is: " + secondSmallest);

	}

}
