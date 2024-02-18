package ArraysandMatrics;
import java.util.Scanner;

public class ArraysFormInputUser {
	public static void main(String[] args) {
		System.out.println("Enter a number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter a arrays number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}

		}

		System.out.println("sum of even " + sum);
		sc.close();
	}

}
