
public class program1 {
	public static void main(String[] args) {
		String str = "CloudteCh";
		char ch = 'l';
		removechar(str, ch);
	}

	static void removechar(String str, char c) {
		int k = str.length();
		String finalstr = "";
		for (int i = 0; i < k; i++) {
			if (str.charAt(i) != c) {

				finalstr = finalstr + str.charAt(i);
			}
		}
		System.out.println(finalstr);

	}

}
