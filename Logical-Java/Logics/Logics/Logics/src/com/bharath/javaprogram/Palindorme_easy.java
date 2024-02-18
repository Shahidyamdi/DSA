package com.bharath.javaprogram;

import java.util.Scanner;

public class Palindorme_easy {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in);) {
			String num = sc.next();
			StringBuffer sb = new StringBuffer(num);
			String reverse = sb.reverse().toString();
			System.out.println(num.equals(reverse) ? "palindorme" : "not palindorme");
		}
	}

}
