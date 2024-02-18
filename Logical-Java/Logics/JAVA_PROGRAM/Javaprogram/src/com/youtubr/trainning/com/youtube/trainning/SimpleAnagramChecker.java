package com.youtube.trainning;
public class SimpleAnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Initialize an array to count occurrences of characters
        int[] charCount = new int[26]; // Assuming only lowercase English alphabets

        // Increment counts for characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        // Decrement counts for characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}