package Assignment11;

public class test {
	public static void main(String[] args) {
	String names []= {"shahid","sameer","ratan","anu","sandhya","janaki"};
	
	System.out.println(names[5]);
	System.out.println("*******************");
	
	for(int i=2;i<names.length;i++) {
		System.out.println(names[i]);
	}
	System.out.println("*******************");
	for (String s : names) {
		System.out.println(s);
		
	}
	}
	

}
