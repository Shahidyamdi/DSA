package com.youtubr.trainning;

import java.util.Scanner;

public class Reverse_integer {
    public static void main(String[] args) {
        System.out.println("ENTER A INTEGER NUMBER");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      /*  int rev =0;
        while(num!=0) {
            rev = rev*10+num%10; // 40+3 =43  430+2=432 4320+1=4321
            num =num/10;  //1234/10=123 123/10 =12 1/10=0
        }
        */
        
        
      
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
       
        
        
		/*W
		 * StringBuilder sb1 = new StringBuilder(); sb1.append(num); StringBuilder rev =
		 * sb1.reverse(); System.out.println("Reversed number....." +rev);
		 */
    }

}
