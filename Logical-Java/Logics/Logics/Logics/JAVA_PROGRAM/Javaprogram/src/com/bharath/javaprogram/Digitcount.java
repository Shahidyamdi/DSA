package com.bharath.javaprogram;

import java.util.Scanner;

public class Digitcount {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		try (Scanner scanner = new Scanner(System.in);) {
			int num = scanner.nextInt(), count = 0;
			while (num != 0) {
				count++;
				num = num/10;

			}
			System.out.println("Number of digit " + count);
		}
	}

}
