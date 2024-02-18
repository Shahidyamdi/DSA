package java8features;

import java.util.function.Function;

public class functiontest {
	public static void main(String[] args) {
		Function<String, Integer>f=s->s.length();
		System.out.println(f.apply("shahid"));
		System.out.println(f.apply("munny"));
	}

}
