package Assignment14;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int guss = 35;

		try (Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("Enter a guss number");
				int userguss = sc.nextInt();
				if (guss == userguss) {
					System.out.println("you enter a correct ! congratulation");
					break;
				} else if ( userguss > guss) {
					System.out.println("you enter a high");
					
				} else {
					System.out.println("you enter a less");
					
				}
			}
		}
	}
}