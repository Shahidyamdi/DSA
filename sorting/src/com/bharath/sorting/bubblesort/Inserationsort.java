package com.bharath.sorting.bubblesort;

public class Inserationsort {

	public static void inserationSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j = j - 1;
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 9, 2 };
		inserationSort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
	}

}
