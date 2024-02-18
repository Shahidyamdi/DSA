package ArraysandMatrics;
import java.util.Scanner;

public class ArraysFormInputUser2 {
	public static void main(String[] args) {
		System.out.println("Enter a number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter a arrays number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
