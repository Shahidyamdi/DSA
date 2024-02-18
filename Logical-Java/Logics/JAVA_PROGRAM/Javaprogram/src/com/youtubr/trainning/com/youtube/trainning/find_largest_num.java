package com.youtube.trainning;

import java.util.Scanner;

public class find_largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("Enter a third number");
        int c = sc.nextInt();

        /*
         * if (a > b && a > c) {
         * System.out.println(a + " largest number");
         * } else if (b > a && b > c) {
         * System.out.println(b + " largest number");
         * } else {
         * System.out.println(c + " largest number");
         * }
         */

        int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(largest + " largest number");

    }

}
