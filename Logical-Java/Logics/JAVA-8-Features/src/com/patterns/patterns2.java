package com.patterns;

public class patterns2 {
	public static void main(String[] args) {
		/*
		 * output ABCDE ABCDE ABCDE ABCDE ABCDE
		 * 
		 * for (int row = 1; row <= 5; row++) { for (int col = 1; col <= 5; col++) {
		 * System.out.print((char) (col + 64)); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * output abcde abcde abcde abcde abcde
		 * 
		 * for (int row = 1; row <= 5; row++) { for (int col = 1; col <= 5; col++) {
		 * System.out.print((char) (col + 96)); } System.out.println(); }
		 */

		/*
		 * output AAAAA BBBBB CCCCC DDDDD EEEEE for (int row = 1; row <= 5; row++) { for
		 * (int col = 1; col <= 5; col++) { System.out.print((char) (row + 64)); }
		 * System.out.println();
		 * 
		 * }
		 */

		/*
		 * output
		 * 
		 * aaaaa bbbbb ccccc ddddd eeeee
		 * 
		 * for (int row = 1; row <= 5; row++) { for (int col = 1; col <= 5; col++) {
		 * System.out.print((char) (row + 96)); } System.out.println();
		 * 
		 * }
		 */
	}
}