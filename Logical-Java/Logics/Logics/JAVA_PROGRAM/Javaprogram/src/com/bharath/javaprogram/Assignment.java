package com.bharath.javaprogram;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {

		System.out.println("enter number");

		try (Scanner scanner = new Scanner(System.in)) {

			int num = scanner.nextInt();

			int evenSum = 0, digit;

			int oddSum = 0;

			while (num > 0) {

				digit = num % 10;

				if (digit % 2 == 0) {

					evenSum = evenSum + digit;

				} else {

					oddSum = oddSum + digit;

				}

				num = num / 10;

			}

			System.out.println("even digit sum = " + evenSum);

			System.out.println("odd digit sum = " + oddSum);

		}
	}

}
