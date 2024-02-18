package com.youtubr.trainning;

import java.util.Scanner;

public class ADD_MATRIX {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("ENTER A Row");
			int m = sc.nextInt();
			System.out.println("ENTER A Column");
			int n = sc.nextInt();
			int a[][] = new int[m][n];
			int b[][] = new int[m][n];
			int sum[][] = new int[m][n];

			System.out.println("ENTER A MATRIX1");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("ENTER A MATRIX2");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					b[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println(" matrix is ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();

			}
		}
	}

}
