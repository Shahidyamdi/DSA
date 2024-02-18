package com.youtube.trainning;

import java.util.Arrays;

public class bubblesort {
	public static void main(String[] args) {
		int a []= {2,4,3,1,5};
		System.out.println("before sorting " +Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
							
				}
			}
		}
		System.out.println("After sorting " +Arrays.toString(a));
	}

}
