package ArraysandMatrics;

import java.util.Scanner;

public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        System.out.println("Enter a number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter a arrays number");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int nsum = 0, psum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i] != 0) {
                nsum += a[i];
            } else if (a[i] > 0 && a[i] != 0) {
                psum += a[i];

            }

        }

        System.out.println("sum of even Negative " + nsum);
        System.out.println("sum of even  positive " + psum);
        sc.close();
    }

}
