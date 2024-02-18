package com.youtube.trainning;

public class swapping_logics {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping ......" + a + " " + b);

        // logic1 third variable
//        int c =a;
//        a=b;
//        b=c;

        // logic 2 use + & -
//
//        a = a + b; // 10 +20 =30 a=30
//        b = a - b; // 30 -20 =10 b=10
//        b = a - b; // 30 -10 =20 b=20

        // logic 3 use * & /
//        a = a * b; // 10 * 20 =200 a=200
//        b = a / b; // 200/20 =10 b =10
//        a = a / b; // 200/10 =20 b =20

        // logic 4
        b = a + b - (a = b);
        // b=10 // 30 - 20 //a=20

        System.out.println("After swapping ......" + a + " " + b);

    }

}
