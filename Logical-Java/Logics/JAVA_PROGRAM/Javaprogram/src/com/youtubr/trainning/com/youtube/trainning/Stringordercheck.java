package com.youtube.trainning;

import java.util.Arrays;
import java.util.Scanner;

public class Stringordercheck {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			char[] charArray = input.toCharArray();
			Arrays.sort(charArray);
			System.out.println(new String(charArray).equals(input));
		}
	}

}
