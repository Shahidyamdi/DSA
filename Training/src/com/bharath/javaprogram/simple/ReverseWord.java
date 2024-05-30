package com.bharath.javaprogram.simple;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Welcome back shahid ";
		
		String[] split = str.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.println(split[i]);
		}
	}

}
