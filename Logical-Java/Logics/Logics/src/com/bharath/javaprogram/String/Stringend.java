package com.bharath.javaprogram.String;

import java.util.Scanner;

public class Stringend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string1");

        String s1 = s.nextLine();

        System.out.println("Enter a string2");

        String s2 = s.nextLine();

        int count=0;

        System.out.println(s1.endsWith(s2));
    }

}
