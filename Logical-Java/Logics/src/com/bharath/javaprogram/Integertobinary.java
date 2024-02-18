package com.bharath.javaprogram;

import java.util.Scanner;

public class Integertobinary {
	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] Binarynumber = new int[10];
		int i = 0;
		while (num != 0) {
			Binarynumber[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(Binarynumber[j]);
		}

	}

}
