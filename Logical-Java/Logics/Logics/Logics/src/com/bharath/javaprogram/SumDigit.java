package com.bharath.javaprogram;

import java.util.Scanner;

public class SumDigit {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		try (Scanner scanner = new Scanner(System.in);) {
			int digit, num = scanner.nextInt();
			int sum = 0;

			while (num != 0) {
				digit = num % 10;
				sum = sum + digit;
				num = num / 10;

			}
			System.out.println("Sum of the digit : " + sum);
		}

	}
}
