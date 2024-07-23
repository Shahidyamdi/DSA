package com.navin.dsa;

public class LInearSearch {
	public static void main(String[] args) {

		int[] numbers = { 3, 7, 1, 8, 2, 9 };
		int target = 9;
		
 
		int result = linearSearch(numbers, target);

		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index: " + result);
			
		}
		
	}

	public static int linearSearch(int[] array, int key) {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			count++;
			if (array[i] == key) {
				
				System.out.println(count);
				return i;
				
				// Return the index of the found element
			}
		}
		return -1; // Element not found
	}
}
