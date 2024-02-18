package java8features;

import java.util.function.Predicate;

public class predicatejoins {
	public static void main(String[] args) {
		int []x= {0,10,2,3,4,5,6,7};
		Predicate<Integer>p=i->i<5;
		
		method1(p, x);
		
		
	}
	static void method1(Predicate<Integer>p1,int [] x) {
		for(int eachvalue:x) {
			if(p1.test(eachvalue)) {
				System.out.println(eachvalue);
			}
		}
		
	}

}
