import java.util.Arrays;

public class program3equals {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 6, 4 ,};
		int arr2[] = { 1, 5, 6, 4 };
		if (areEquals(arr1, arr2)) {
			System.out.println("two arrays are same");

		} else {
			System.out.println("two arrays are not same");
		}
	}

	public static boolean areEquals(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if (m != n) {
			return false;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < m; i++) {
			if (arr1[i] != arr2[i]) {
				return false;

			}
		}
		return true;

	}

}
