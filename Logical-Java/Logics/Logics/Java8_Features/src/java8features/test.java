package java8features;

public class test {
	public static void main(String[] args) {
		a a =()->System.out.println("inside method");
		a.mymethod();
		b b =()->System.out.println("inside method2");
		b.mymethod();
	}

}
