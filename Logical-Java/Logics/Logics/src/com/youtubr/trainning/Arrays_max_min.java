package com.youtubr.trainning;

public class Arrays_max_min {
	public static void main(String[] args) {

		int a[] = { 100, 50, 60, 20, 30 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("MAX NUMBER>>>> " + max);

		int min = max;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			
		}
		System.out.println("MIN NUMBER>>>> " + min);

	}

}
