package Assignment9;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int pin = 123;
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Enter a your pin  Attempts" + i);
				int userpin = sc.nextInt();
				if (userpin == pin) {
					System.out.println("correct pin");
					break;
				} else {
					System.out.println("wrong pin");
				}
				if (i == 4) {
					System.out.println("sorry Your account block for 24hrs");
				}
			}

		}

	}

}
