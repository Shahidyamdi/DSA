package com.bharath.javaprogram;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);

		int digit, num = sc.nextInt();

		boolean isDuckNumber = false;
		while (num != 0) {
			digit = num % 10;
			if (digit == 0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
			if (isDuckNumber) {
				System.out.println("its a duck number");
			} else {
				System.out.println("not a duck number");
			}
		}
	}
