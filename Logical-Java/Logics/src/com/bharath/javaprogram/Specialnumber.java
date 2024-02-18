package com.bharath.javaprogram;

import java.util.Scanner;

public class Specialnumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner scanner = new Scanner(System.in);) {
            int num = scanner.nextInt();
            int digit1;
            int digit2;
            int res;

            digit1 = num % 10;
            digit2 = num / 10;
            res = (digit1 + digit2) + (digit1 * digit2);
            System.out.println(res == num ? "special number" : "not special number");

        }
    }

}
