package Assignment18;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			if (num > 0) {
				if (num % 2 == 0) {
					System.out.println("Number is postive & even");
				} else {
					System.out.println("Number is postive & odd");
				}
			} 
			else if (num < 0) {
				if (num % 2 == 0) {
					System.out.println("Number is negative & even");
				} else {
					System.out.println("Number is negative & odd");
				}
			}
				else {
					System.out.println("number is zero");
				}
		
		}
	}
}