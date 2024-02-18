package com.youtube.trainning;

public class Arrays_duplicate_element {
	public static void main(String[] args) {
		String a[] = { "java", "python", "c", "c", "java" };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Found duplicate elements...." + a[i]);
					flag = true;
				}
			}
		}

		if (flag = false) {
			System.out.println(" Not Found  duplicate elements....");

		}
	}

}
