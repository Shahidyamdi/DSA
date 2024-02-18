package com.dsa;

public class linearsearch {

	public static int linearSearch(int[] arr, int target) {
		int steps = 0;
		for (int i = 0; i < arr.length; i++) {
			steps++;
			if (arr[i] == target) {

				System.out.println(steps);
				return i; // Element found, return its index
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 89, 34, 55 };

		int target = 12;

		int result = linearSearch(arr, target);

		if (result != -1) {

			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found in the array");
		}
	}

}
