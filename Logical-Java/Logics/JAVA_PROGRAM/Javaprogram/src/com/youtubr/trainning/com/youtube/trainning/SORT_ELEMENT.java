package com.youtube.trainning;

import java.util.Arrays;
import java.util.Collections;

public class SORT_ELEMENT {
	public static void main(String[] args) {
		
	
	Integer a []= {60,20,30,10,40,50};
//	
	System.out.println("before sort " +Arrays.toString(a));
//	
//	Arrays.parallelSort(a);
//	System.out.println("after sort " +Arrays.toString(a));
		
//	Arrays.sort(a);	
//	System.out.println("after sort " +Arrays.toString(a));
		
		
	//descending order
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("after sort " +Arrays.toString(a));
	
	
		
		
	}
}
