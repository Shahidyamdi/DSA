package Assigment3;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		String username;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user name ");
		username = sc.next();
		System.out.println("Enter a password ");
		password = sc.next();
		if(username.equalsIgnoreCase("shahid")&& password.equalsIgnoreCase("shahid")) {
			System.out.println("login success");
		}
		else {
			System.out.println("login fail");
		}
		
	}

}
