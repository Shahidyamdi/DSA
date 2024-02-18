package com.youtubr.trainning;

import java.util.Scanner;

public class vowelremover {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			StringBuffer bf = new StringBuffer();
			System.out.println(input.replaceAll("[aeio]", ""));

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
						|| input.charAt(i) == 'o') {
					continue;

				} else {
					bf = bf.append(input.charAt(i));

				}
			}
			System.out.println(bf);

		}

	}

}
