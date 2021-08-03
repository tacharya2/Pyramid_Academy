package pyramidAcademy;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String str1 = "(vwdv";
		String str2 = "(vwd)v";
		String str3 = "(((vwdv))";
		String str4 = "((()vwd)v))";

		System.out.println(solution(str1));
		System.out.println(solution(str2));
		System.out.println(solution(str3));
		System.out.println(solution(str4));
	}

	public static String solution(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		if (s.length() == 0) {
			return "unbalanced";
		}
		for (int i = 0; i < s.length(); i++) {

//			if (s.charAt(i) != '(' || s.charAt(i) != ')') {
//				return "unbalanced";
//			}
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			if (s.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return "unbalanced";
				}
				stack.pop();
			}
		}
		// System.out.println("S= " + stack);
		if (stack.isEmpty()) {
			// System.out.println("S= " + stack);
			return "balanced";

		} else {

			return "unbalanced";
		}
	}
}
