package com.bharath.javaprogram;

public class Specialtwodigit {
    public static void main(String[] args) {
        int num, digit1, digit2, result = 0;

        for (num = 10; num < 100; num++) {

            digit1 = num % 10;

            digit2 = num / 10;

            result = (digit1 + digit2) + (digit1 * digit2);

            System.out.print(result + " " + num + " ");

            System.out.println(result == num ? "special number" : "not special");
        }

    }
}