package com.bharath.javaprogram;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out.println("Enter a  start number");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter a  end  number");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0;
            if (i > 1) {
                for (int j = 2; j < i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                }

            }
        }
    }

}
