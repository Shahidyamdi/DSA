package com.bharath.javaprogram;

import java.util.Scanner;

public class fibonacciseries2 {

	private static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(fibonacci(i) + " ");
		}

	}

}
