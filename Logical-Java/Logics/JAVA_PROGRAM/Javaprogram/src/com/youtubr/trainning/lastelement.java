package com.youtubr.trainning;

import java.util.Scanner;

public class lastelement {
	public static void main(String[] args) {
		System.out.println("ENTER A ELEMENT");
		try (Scanner sc = new Scanner(System.in)) {
			int s = sc.nextInt();
			System.out.println("ENTER A ELEMENT ARRAY");
			int a[] = new int[s];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();

			}
			System.out.println("Last element");
			int m = sc.nextInt();
			for (int i = s - m; i < s; i++) {
				System.out.println(a[i]);
			}

		}
	}

}
