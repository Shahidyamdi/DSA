package Assignment12;

public class test {
	public static void main(String[] args) {
		int totalsum = 0;
		int evensum = 0;
		int oddsum = 0;

		for (int i = 1; i <= 10; i++) {
			totalsum += i;

			if (i % 2 == 0) {
				evensum += i;

			} else if (i % 2 != 0) {
				oddsum += i;

			}
		}
		System.out.println("total sum = " + totalsum);
		System.out.println("even sum = " + evensum);
		System.out.println("odd sum = " + oddsum);

	}

}
