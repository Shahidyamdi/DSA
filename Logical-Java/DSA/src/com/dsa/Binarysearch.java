package com.dsa;

public class Binarysearch {
	public static int binarySearch(int[] arr, int target) {
		int steps = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				System.out.println("steps...." + steps);
				return mid; // Element found, return its index
			}

			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1; // Element not found

	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 55, 67, 89 };
		int target = 67;
		int result = binarySearch(arr, target);

		if (result != -1) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found in the array");
		}

	}
}
