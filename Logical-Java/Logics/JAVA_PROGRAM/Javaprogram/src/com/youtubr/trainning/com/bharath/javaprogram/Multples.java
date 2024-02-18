package com.bharath.javaprogram;

import java.util.Scanner;

public class Multples {
	public static void main(String[] args) {
		System.out.println("Enter a multiple Number");
		try (Scanner scanner = new Scanner(System.in);) {
			int num = scanner.nextInt();
			for (int i = 1; i <= 10; ++i) {
				System.out.printf("%d * %d = %d \n", num, i, num * i);
			}
		}

	}

}
