package assignment5;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a name");
			String name = sc.next();
			System.out.println("enter a  science marks");
			int science = sc.nextInt();
			System.out.println("enter a  social marks");
			int social = sc.nextInt();
			System.out.println("enter a  maths marks");
			int maths = sc.nextInt();
			int total, avg;
			char grade;
			total = science + social + maths;
			avg = total / 3;
			if (avg >= 70) {
				grade = 'A';
			} else if (avg >= 60 && avg <= 69) {
				grade = 'B';

			} else if (avg >= 50 && avg <= 59) {
				grade = 'c';

			} else {
				grade = 'D';
			}
			System.out.println(" hey " + name + " your total marks ... " + total + " your percentage " + avg
					+ "and your grade is.." + grade);

		}

	}
}
