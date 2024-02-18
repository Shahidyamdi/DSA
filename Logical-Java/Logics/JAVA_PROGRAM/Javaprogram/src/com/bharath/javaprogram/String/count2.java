package com.bharath.javaprogram.String;

import java.util.Scanner;

public class count2 {
    public static void main(String[] args) {
        System.out.println("Enter a words");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
       System.out.println(line.split(" ").length);
    }

}
