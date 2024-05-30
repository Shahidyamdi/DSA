package com.bharath.javaprogram.simple;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String reverse = " ";
		System.out.println("Enter a String ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("given string is palindorme");
		} else {
			System.out.println("given string is  not palindorme");

		}

	}

}
