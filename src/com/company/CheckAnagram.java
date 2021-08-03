package pyramidAcademy;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "7152";
		String word2 = "7215";
		product(word1, word2);
	}

	public static boolean product(String word1, String word2) {

		if (word1.length() <= 1 && word2.length() <= 1) {
			return false;
		} else {
			char[] ch1 = word1.toCharArray();
			char[] ch2 = word2.toCharArray();

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {

					return false;
				} else {
					return true;
				}
			}

			System.out.println(ch1);
			System.out.println(ch2);
		}
		return true;
	}

}
