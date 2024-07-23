package com.navin.dsa;

public class Binarysearch {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 2;

		int result = binarySearch(numbers, target);

		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	public static int binarySearch(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		int count =0;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			count++;

			// Check if key is present at mid
			if (array[mid] == key) {
				System.out.println(count);
				return mid;
			}

			// If key greater, ignore left half
			if (array[mid] < key) {
				left = mid + 1;
			}
			// If key is smaller, ignore right half
			else {
				right = mid - 1;
			}
		}

		// Key was not present in array
		return -1;

	}

}
