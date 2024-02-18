package assignment2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Enter you are day (mon/tu/wed/thu/fr....)");
		try (Scanner sc = new Scanner(System.in)) {
			String day = sc.next();
			if (day.equals("mon") || day.equals("tue") || day.equals("wed")) {
				System.out.println("today discount is 5% enjoy shopping");
			} else if (day.equals("thu") || day.equals("fri")) {
				System.out.println("today discount is 4% enjoy shopping");

			} else if (day.equals("sat") || day.equals("sun")) {
				System.out.println("today discount is 3% enjoy shopping");
			} else {
				System.out.println("error input! please check it");
			}
		}
	}

}
