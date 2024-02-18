package Assignment19;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a your option 1:All number or 2:Even number or 3: odd number");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter a all number 1to10");
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				System.out.println("Enter a all evennumber  1to10");
				for (int i = 0; i <= 10; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}

				}
				break;
			case 3:
				System.out.println("Enter a all Oddnumber  1to10");
				for (int i = 0; i <= 10; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}

				}
				break;
			default:
				System.out.println("Invaild number");
				break;
			}

		}
	}
}