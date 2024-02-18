package com.youtube.trainning;

public class swapping {
    public static void main(String[] args) {
        String a = "hi";
        String b ="hello";
        
        System.out.println("Before swapping..." +a+ " " +b);
        
        String c = a;
        a=b;
        b=c;
        System.out.println("After swapping..." +a+ " " +b);
    }

}
