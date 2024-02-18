package java8features;

import java.util.function.Predicate;

public class predicates {
	public static void main(String[] args) {
		Predicate<Integer>p =  i->(i>20);
		System.out.println(p.test(10));
		System.out.println(p.test(25));
		System.out.println(p.test(30));
	}

}
