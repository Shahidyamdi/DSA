package com.youtubr.trainning;

public class Arrays_sum {
	public static void main(String[] args) {
		
		int [] a= {1,5,7,9,6,};
		int sum = 0;
		for(int i=0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		System.out.println("the sum of array..... " +sum);
	}

}
