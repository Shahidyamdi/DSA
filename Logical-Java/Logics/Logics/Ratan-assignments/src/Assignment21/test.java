package Assignment21;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a  startnumber");
			int start = sc.nextInt();
			System.out.println("Enter a  endnumber");
			int end = sc.nextInt();
			if (start <= end) {
				while (start <= end) {
					System.out.println(start);
					start++;
				}
			} else {
				while (start >= end) {
					System.out.println(start);
					start--;
				}

			}

		}
	}
}