package com.javaprograms;

public class Factorial2 {

	public static int sum(int n) {
		if (n <= 1) {
			return n ;

		} else {
			return n + sum(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
 
	}

}
