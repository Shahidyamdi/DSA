package Assignment15;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("Enter a rollno");
				int rollno = sc.nextInt();
				System.out.println("Enter a name");
				String name = sc.next();
				System.out.println("Enter a marks");
				int marks = sc.nextInt();
				System.out.println(rollno + " " + name + " " + marks);
				System.out.println("Do you want another record (yes/no)");

				String option = sc.next();
				if (option.equalsIgnoreCase("no")) {
					break;
				}

			}
		}
	}
}