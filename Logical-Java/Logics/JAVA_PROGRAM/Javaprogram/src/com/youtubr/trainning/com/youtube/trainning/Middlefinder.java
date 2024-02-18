package com.youtube.trainning;

import java.util.Scanner;

public class Middlefinder {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.next();
			int length = input.length();
			if (length % 2 == 0) {
				System.out.println(input.substring(length / 2 - 1, length / 2 + 1));
			} else {
				System.out.println(input.substring(length / 2, length / 2 + 1));

			}
		}

	}
}
