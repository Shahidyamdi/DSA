package com.youtubr.trainning;

public class Countevenandodd {
    public static void main(String[] args) {
        int num = 1234;
        int even_count = 0;  
        int odd_count = 0;

        while (num > 0) { //1234 123 12
            int rem = num % 10; // 4 3 2 1
            if (rem % 2 == 0) {
                even_count++;//1 //2
            } else {
                odd_count++;//1 //2
            }
            num = num / 10;//123 12 1 0
        }
        System.out.println("number of event number " +even_count);
        System.out.println("number of odd number   "  + odd_count);
       

    }

}
