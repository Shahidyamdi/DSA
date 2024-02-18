
package com.dsa;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Original array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("\nSorted array:");
		printArray(arr);
	}

	// Bubble sort function
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// If no two elements were swapped in the inner loop, the array is already
			// sorted.
			if (!swapped) {
				break;
			}
		}
	}

	// Utility function to print an array
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
