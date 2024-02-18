package com.bharath.javaprogram.String;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        System.out.println("Enter a words");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isWhitespace(line.charAt(i))) {
                count++;

            }
        }
        System.out.println(count + 1);
    }

}
