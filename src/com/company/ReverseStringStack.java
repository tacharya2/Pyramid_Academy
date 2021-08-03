package pyramidAcademy;

import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {

		String str = "I love you";
		System.out.println(solution(str));
	}

	public static String solution(String s) {
		String str = "";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		while (!stack.isEmpty()) {
			str += stack.pop();
		}
		System.out.println(str);

		return str;
	}

}
