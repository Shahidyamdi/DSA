package com.bharath.javaprogram.String;

import java.util.Scanner;

public class vowelscount {
    public static void main(String[] args) {
        System.out.println("Enter a String");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(input);

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E'
                    || input.charAt(i) == 'I' || input.charAt(i) == 'U' || input.charAt(i) == 'U') {

                vowel++;

            }

            else {

                consonant++;

            }

        }

        System.out.println("No of vowels :" + vowel);

        System.out.println("No of consonants :" + consonant);

        sc.close();

    }

}
