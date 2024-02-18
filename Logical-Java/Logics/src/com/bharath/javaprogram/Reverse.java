package com.bharath.javaprogram;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in);) {
			int digit, num = sc.nextInt();
			int result = 0; // 12345
			while (num != 0) {
				digit = num % 10; // 5
			                    	// 4
			                    	// 3
				                    // 2
				                     //1
				
				result = result * 10 + digit;
				num = num / 10;

			}
			System.out.println(result); // 5
										// 5*10=50+4=54
			                             //54*10=540+3=543
			                             //543*10=5430+2=5432
			                             //5432*10=54320+1=54321
			
			

		}
	}

}
