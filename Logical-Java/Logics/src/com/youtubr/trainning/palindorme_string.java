package com.youtubr.trainning;

import java.util.Scanner;

public class palindorme_string {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_str = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (org_str.equals(rev)) {
            System.out.println("is a palindorme " + org_str);
        } else {
            System.out.println("is not a palindorme " + org_str);
        }

    }

}
