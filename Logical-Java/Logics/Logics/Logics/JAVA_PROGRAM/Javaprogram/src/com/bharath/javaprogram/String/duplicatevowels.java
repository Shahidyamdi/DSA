package com.bharath.javaprogram.String;

import java.util.Scanner;

public class duplicatevowels {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
         output.append(input.charAt(i));
         output.append(input.charAt(i));
        }
        System.out.println(output);
        sc.close();

    }

}
