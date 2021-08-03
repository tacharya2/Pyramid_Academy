package pyramidAcademy;

import java.util.HashSet;
import java.util.List;

public class SetContainsLetter {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(List.of(2, -4, -6, 5, 9, 14));
		System.out.println(solution(set, 6));
	}

	public static Object solution(HashSet<Integer> nums, int elm) {

		if (nums.contains(elm)) {
			return elm;
		}

		return "?";
	}
}
