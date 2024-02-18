package com.youtubr.trainning;

public class Linear_search {
	public static void main(String[] args) {
		int a[] = { 10, 60, 20, 30, 50, 40 };

		int search_ele = 50;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (search_ele == a[i]) {
				System.out.println("the element is....." + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("not found");
		}
	}
}
