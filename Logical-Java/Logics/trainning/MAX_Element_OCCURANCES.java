package com.youtubr.trainning;

import java.util.Scanner;

public class MAX_Element_OCCURANCES {
	public static void main(String[] args) {
		System.out.println("ENTER A STRING");
		try(Scanner sc = new Scanner(System.in)){
			int arr[]= new int[256];
			String s = sc.nextLine();
			for(int i=0;i<s.length();i++) {
				arr[(int)s.charAt(i)]++;
			}
			int max =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			System.out.println("Element occurs ... "+(char)max);
		}
	}

}
