package assignment1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("even number" + num);
		} else {
			System.out.println("odd number " + num);
		}
	}

}
