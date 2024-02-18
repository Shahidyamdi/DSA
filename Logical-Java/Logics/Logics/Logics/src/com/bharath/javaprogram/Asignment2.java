package com.bharath.javaprogram;

import java.util.Scanner;

public class Asignment2 {
	public static void main(String[] args) {

		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);

		int digit, num = sc.nextInt();

		System.out.println("Enter a digit to Search:");

		int digitToSearch = sc.nextInt();

		int count = 0;

		while (num != 0) {

			digit = num % 10;

			if (digit == digitToSearch) {

				count++;

			}

			num = num / 10;

		}

		System.out.println(" ");

		System.out.println("Count of digits is: " + count);

	}

}
