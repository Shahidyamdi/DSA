package java8features;

import java.util.function.Predicate;

public class predicateaction {
	public static void main(String[] args) {
		int[] x = { 0, 10, 2, 3, 4, 5, 6, 7 };
		Predicate<Integer> p = i -> i < 10;
		Predicate<Integer> p1 = i -> i % 2 == 0;

		System.out.println("Greater then 10");
		method1(p, x);
		System.out.println("Even number");
		method1(p1, x);
		System.out.println("not greater then 10 and even");
		method1(p.and(p1), x);
		System.out.println("not greater then 10");
		method1(p.negate(), x);
		System.out.println("greater then 10 or even");
		method1(p.or(p1), x);

	}

	static void method1(Predicate<Integer> p1, int[] x) {
		for (int eachvalue : x) {
			if (p1.test(eachvalue)) {
				System.out.println(eachvalue);
			}
		}

	}

}
