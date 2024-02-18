package com.bharath.patterns;

import java.util.Scanner;

public class invertedtriangle {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = input; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
