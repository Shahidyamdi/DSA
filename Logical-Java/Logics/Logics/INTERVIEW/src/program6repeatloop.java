import java.util.Scanner;

public class program6repeatloop {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter a number");
			int z = sc.nextInt();
			sum= sum+z;
			
		}
		System.out.println("the total is"+sum);
	}

}
