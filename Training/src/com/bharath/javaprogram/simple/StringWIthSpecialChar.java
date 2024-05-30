package com.bharath.javaprogram.simple;

public class StringWIthSpecialChar {
	public static void main(String[] args) {
		String s = "r#aa$pid";
		char[] array = s.toCharArray();
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			if (!Character.isAlphabetic(array[i]))
				i++;
			else if (!Character.isAlphabetic(array[j]))
				j--;
			char ch = array[i];
			array[i] = array[j];
			array[j] = ch;
			i++;
			j--;
		}
		String sf = new String(array);
		System.out.println(sf);
	}

}
