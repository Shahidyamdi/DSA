package java8features;

public class Myclass {
	public void Mymethod123(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Myinterface f =i->System.out.println(i);
		f.Mymethod(20);
		
		Myclass c = new Myclass();
		Myinterface g = c::Mymethod123;
		g.Mymethod(10);
	}

}
