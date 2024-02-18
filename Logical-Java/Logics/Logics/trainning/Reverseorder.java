package com.youtubr.trainning;

public class Reverseorder {
	public static void main(String[] args) {
		String input = "Java is awesome";

		// Split the input string into words
		String[] words = input.split(" ");

		// Create a StringBuilder to build the reversed string
		StringBuilder reversed = new StringBuilder();

		// Iterate through the words in reverse order and append them to the
		// StringBuilder
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" "); // Add a space between words
			}
		}

		// Print the reversed string
		System.out.println(reversed.toString());
	}

}
