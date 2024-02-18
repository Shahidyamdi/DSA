package com.youtubr.trainning;

import java.util.Scanner;

public class Consecutivefinder {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			boolean found = false;
			
			for(int i=0;i<input.length()-1;i++) {
				if(input.charAt(i) == input.charAt(i+1)) {
				
					found = true;
					break;
				}
			}
			System.out.println(found);
			
			

}
	}
}
