package com.constructor.ref;

public class test {
	public static void main(String[] args) {
		Myinterface f = s->new Myclass(s);
		f.get("using lambdas");
		
		Myinterface f1 = Myclass::new;
		f1.get("inside the constructor");
	}

}
