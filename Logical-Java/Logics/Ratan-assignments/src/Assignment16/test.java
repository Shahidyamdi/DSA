package Assignment16;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Enter table number");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}

		}
	}
}