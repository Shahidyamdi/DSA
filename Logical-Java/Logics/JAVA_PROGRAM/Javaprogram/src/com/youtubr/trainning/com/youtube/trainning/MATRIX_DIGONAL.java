package com.youtube.trainning;

import java.util.Scanner;

public class MATRIX_DIGONAL {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("ENTER A row");
			int m = sc.nextInt();
			System.out.println("ENTER A column");
			int n = sc.nextInt();
			int a[][] = new int[m][n];

			System.out.println("ENTER A MATRIX");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(" matrix is ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();

			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						System.out.print(a[i][j]);
					}
					
				}
			}
			System.out.println();
		}
	}

}