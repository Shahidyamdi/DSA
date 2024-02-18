package Assignment6;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a  your Location");
		String location = sc.next();
		if(location.equalsIgnoreCase("sec")||location.equalsIgnoreCase("hyd") ) {
			System.out.println("visit charminar  ...enjoy a day");
		}
		else if(location.equalsIgnoreCase("vij")||location.equalsIgnoreCase("bza") ) {
			System.out.println("visit durga temple  ...enjoy a day");
		}
		else if(location.equalsIgnoreCase("ampt")||location.equalsIgnoreCase("srn") ) {
			System.out.println("visit ratan sir class  ...enjoy the subject");
		}
		else {
			System.out.println("invaild location ! please try again");
		}
	}

}
