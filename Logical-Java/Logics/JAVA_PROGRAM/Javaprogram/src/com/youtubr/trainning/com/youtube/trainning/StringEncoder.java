package com.youtube.trainning;

import java.util.Scanner;

public class StringEncoder {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			String output = " ";

			for (int i = 0; i < input.length(); i++) {
				output += (char) (input.charAt(i) + 1);
			}
			System.out.println(output);
		}
	}

}
