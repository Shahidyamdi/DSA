package Assignment8;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a  your day");
			String day = sc.next();
			switch (day) {
			case "mon":
			case "tue":
			case "wedn":
			case "thu":
			case "fri":
				System.out.println("Weekdays focus on work");
				break;
			case "sat":
			case "sun":
				System.out.println("enjoy the weekend!");
				break;
			default:
				System.out.println("worg input ! try again");

			}

		}

	}

}
