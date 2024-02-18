package com.youtube.trainning;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is even.");
		} else {
			System.out.println(n + " is odd.");
		}

		// Close the scanner to prevent resource leak
		sc.close();
	}

}
