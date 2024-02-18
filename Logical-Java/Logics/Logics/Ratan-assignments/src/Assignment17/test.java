package Assignment17;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter table number");
			int num = sc.nextInt();

			for (int i = 2; i <= num; i++) {
				for (int j = 1; j <=10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}

			}

		}
	}
}