package pyramidAcademy;

import java.util.HashSet;
import java.util.Set;

public class AnagramWithSet {

	public static void main(String[] args) {
		String word1 = "51POlL";
		String word2 = "51POlL";
		System.out.println(solution(word1, word2));


	}

	public static boolean solution(String word1, String word2) {
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();

		if (word1.equals(word2)) {
			return false;
		}
		if (word1.length() == 0 || word2.length() == 0) {
			return false;
		} else {
			for (int i = 0; i < word1.length(); i++) {
				set1.add((word1.toLowerCase().charAt(i)));
			}
			for (int i = 0; i < word1.length(); i++) {
				set2.add((word2.toLowerCase().charAt(i)));
			}
			if (set1.equals(set2)) {

				return true;
			}
		}
		return false;
	}
}
