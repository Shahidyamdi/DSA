package Assignment20;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a  firstnumber");
			int num1 = sc.nextInt();
			System.out.println("Enter a  second number");
			int num2 = sc.nextInt();
			System.out.println("Enter a operator{ + - * % /");
			String operator = sc.next();
			int result = 0;
			switch (operator) {

			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			case "/":
				result = num1 / num2;
				break;

			default:
				System.out.println("Enter a Arthimetic operator");
				break;
			}
			System.out.println("Result " +result);

		}
	}
}