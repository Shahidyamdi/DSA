package com.basics;

public class Prime1to100 {
	public static void prime() {
		for(int i=2;i<100;i++) {
			boolean check = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					check =false;
					break;
				}
			}
			if(check==true) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		prime();
	}

}
