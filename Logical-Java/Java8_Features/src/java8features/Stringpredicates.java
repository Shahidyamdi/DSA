package java8features;

import java.util.function.Predicate;

public class Stringpredicates {
	public static void main(String[] args) {
		Predicate<String>p=i->(i.length()>5);
		System.out.println(p.test("l"));
		System.out.println(p.test("shahid"));
	}

}
