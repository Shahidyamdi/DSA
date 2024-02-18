package com.youtube.trainning;

public class sumex {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {//1234
            sum = sum + num % 10; //4+3+2+1
            num = num / 10; //123 //12 /1

        }
        System.out.println("sum of number is " + sum);
    }

}
