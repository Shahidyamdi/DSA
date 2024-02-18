package com.bharath.javaprogram.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class evenwords2 {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] word = input.split(" ");
        for(int i=0;i<word.length;i++) {
            if(word[i].length()%2==0) {
                System.out.println(word[i]);
            }
        }
       
    }

}
