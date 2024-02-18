package java8features;

public class Refdemo {
	
	public static void mymethod() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) {
		Runnable r = Refdemo::mymethod;
		
		Thread thread = new Thread(r);
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println("parents thread");
		}
		
	}

}


