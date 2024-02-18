package com.bharath.javaprogram.String;

import java.util.Scanner;

public class Stringpalindorme {

    public static void main(String[] args) {
        System.out.println("Enter a  string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        String output ="";
        for(int i=input.length()-1;i>=0;i--) {
            output+=input.charAt(i);
        }
        System.out.println(output);
        System.out.println(output.equals(input)?"palindorme":"not a palindrome");
    }

}
