package com.youtube.trainning;

import java.util.Arrays;
import java.util.List;

public class LargestNumber2 {
	public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15);
	    Integer maxlarge = numbers.stream().reduce(Integer.MIN_VALUE,Integer::max);
	    int minValue = numbers.stream() .reduce(Integer.MAX_VALUE, Integer::min);
	    
	    System.out.println("Largest number is : " +maxlarge);
	    System.out.println("The minimum value is: " + minValue);
	}

}
