package com.bharath.javaprogram;

import java.util.Scanner;

public class perfectnumber {
    static boolean isperfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;

    }

    public static void main(String[] args) {
        System.out.println("Enter a  start number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isperfect(num));
    }

}
