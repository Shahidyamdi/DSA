package Assignment7;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a  your first number");
			int num1 = sc.nextInt();
			System.out.println("Enter a  your second number");
			int num2 = sc.nextInt();
			if (num1 > num2) {
				System.out.println("First number is greater");
			} else {
				System.out.println("Second number is greater");
			}
		}
	}

}
