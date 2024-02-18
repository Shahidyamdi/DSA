package com.bharath.javaprogram.String;

import java.util.Scanner;

public class Stringreverse2 {
public static void main(String[] args) {
    System.out.println("Enter a  string");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine(); 
    System.out.println(new StringBuffer(input).reverse());
}
}
