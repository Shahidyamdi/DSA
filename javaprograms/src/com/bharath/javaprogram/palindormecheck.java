package com.bharath.javaprogram;

import java.util.Scanner;

public class palindormecheck {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in);) {
			int digit, num = sc.nextInt();
			int result = 0; // 12345
			int temp = num;
			while (num != 0) {
				digit = num % 10; // 5
									// 4
									// 3
									// 2
									// 1

				result = result * 10 + digit;
				num = num / 10;
			}
				if (result == temp) {
					System.out.println("Is a palindorme");
				} else {
					System.out.println("Is not a palindorme");
				}

			}

		}
	

}
