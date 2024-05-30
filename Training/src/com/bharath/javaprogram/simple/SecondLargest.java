package com.bharath.javaprogram.simple;

public class SecondLargest {
	public static void main(String[] args) {
		int[] array = { 10, 20, 5, 15, 30 }; // Example array

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("The second largest number in the array is: " + secondLargest);
		} else {
			System.out.println("There is no second largest number in the array.");
		}
	}
}
