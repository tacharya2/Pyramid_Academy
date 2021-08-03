package pyramidAcademy;

import java.util.Stack;

public class Parenthesis_balance {

	public static void main(String[] args) {
		String str = "\\( \\) \\\\( \\\\)\\\\\\\\)";
		System.out.println(solution(str));

	}

	public static String solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == ')') {
				stack.push((s.charAt(i)));
			}
		}
		System.out.println(stack); // 1
		String str = "";
		while (!stack.isEmpty()) {
			str += stack.pop();
		}
		// System.out.println(str); // 2

		return str;
	}
}

