package com.youtubr.trainning;

import java.util.Scanner;

public class palindorme_number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orgnum = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (orgnum == rev) {
            System.out.println("Its a palindorme number " + rev);
        } else {
            System.out.println("its not a palindorme number " + rev);
        }
    }

}
