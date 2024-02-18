package com.bharath.javaprogram;

import java.util.Scanner;

public class CreditCardIssuer {
	public static void main(String[] args) {
		System.out.println("Enter a Credit card score");
		try (Scanner scanner = new Scanner(System.in);) {
			int creditcard = scanner.nextInt();
			if (creditcard < 400 || creditcard > 850) {
				throw new IllegalArgumentException("Invaild score " + creditcard);
			} else if (creditcard >= 400 && creditcard <600) {
				System.out.println("Sliver Card ");
			} else if (creditcard >= 600 && creditcard < 850) {
				System.out.println("Gold Card ");
			} else {
				System.out.println(" Platinum card ");
			}
		}
	}
}
