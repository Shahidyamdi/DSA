package Assignment13;

public class test {
	public static void main(String[] args) {
		int number[] = { 7, 3, 9, 4, 89, 76, 34 };
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				break;
			}

			System.out.println(number[i]);
		}
		System.out.println("********************************");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				continue;
			}

			System.out.println(number[i]);
		}

	}
}  