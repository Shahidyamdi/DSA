package com.youtube.trainning;

public class Arrays_equals {
	public static void main(String[] args) {
		int a1[] = { 2, 4, 6, 8 };
		int a2[] = { 2, 4, 6, 8 };

		// boolean status = Arrays.equals(a1, a2);
		/*
		 * if (status == true) { System.out.println("arrays are equal"); } else {
		 * System.out.println("arrays are not equal"); }
		 */

		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}

	}

}
