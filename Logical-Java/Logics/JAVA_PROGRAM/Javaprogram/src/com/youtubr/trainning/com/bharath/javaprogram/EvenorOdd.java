package com.bharath.javaprogram;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner scanner = new Scanner(System.in);) {
			int num = scanner.nextInt();
			if (num <= 0) {
				throw new IllegalArgumentException("invaild data" + num);
			} else {
				if (num % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
			}

		}
	}

}
