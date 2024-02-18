package com.bharath.patterns;

import java.util.Scanner;

public class Pascaltriangle {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i <= input - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = input - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}
		sc.close();
	}

}
