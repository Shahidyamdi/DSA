package com.youtubr.trainning;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String rev = " ";
        /*
         * for(int i=a.length()-1;i>=0;i--) {
         * rev = rev + a.charAt(i);
         * }
         */

        // using char array

        /*
         * char b[] = a.toCharArray();
         * for (int i = b.length - 1; i >= 0; i--) {
         * rev = rev + b[i];
         * 
         * }
         * System.out.println("REVERSED STRING >>>> " + rev);
         */

        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());

        sc.close();
    }
}
