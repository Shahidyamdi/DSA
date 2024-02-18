package assignment4;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Enter you are number)");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("positive number");
			} else if (num < 0) {
				System.out.println("negative number");
			} else
				System.out.println("zero");
		}

	}
}
