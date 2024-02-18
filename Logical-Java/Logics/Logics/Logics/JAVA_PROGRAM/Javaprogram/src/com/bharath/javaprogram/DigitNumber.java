package com.bharath.javaprogram;

import java.util.Scanner;

public class DigitNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		try (Scanner scanner = new Scanner(System.in);) {
			int digit, num = scanner.nextInt();

			while (num != 0) {
				digit = num % 10;
				System.out.print(digit + " ");
				num = num / 10;
			}
		}

	}
}
