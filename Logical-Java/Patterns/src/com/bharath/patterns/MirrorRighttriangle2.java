package com.bharath.patterns;

import java.util.Scanner;

public class MirrorRighttriangle2 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				if (j <= input - i) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
