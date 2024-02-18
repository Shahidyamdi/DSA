package com.bharath.javaprogram.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class evenwords {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        while(tokenizer.hasMoreTokens()) {
            String eachtoken =tokenizer.nextToken();
            if(eachtoken.length()%2==0) {
                System.out.println(eachtoken);
            }
        }

    }

}
