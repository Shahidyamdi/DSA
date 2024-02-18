package com.youtubr.trainning;

import java.util.Scanner;

public class findgold {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			String s2 = "gold";
			boolean found = false;
			s1 = s1.toLowerCase();
			for (int i = 0; i < s1.length(); i++) {
				int k = i, j = 0;

				for (j = 0; j < s2.length(); j++) {
					if (s1.charAt(k) != s2.charAt(j)) {
						break;

					}
					k++;
				}

				if (j == s2.length()) {
					found = true;
					break;

				}
			}
			if (found) {
				System.out.println("gold");
			} else {
				System.out.println("no gold");
			}
		}
	}

}
