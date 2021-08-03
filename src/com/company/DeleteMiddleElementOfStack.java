package pyramidAcademy;

import java.util.List;
import java.util.Stack;

public class DeleteMiddleElementOfStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.addAll(List.of(45, 1, 19, 18, 34, 99, 1));

		System.out.println(solution(stack));
	}

	public static Stack<Integer> solution(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return stack;
		} else if (stack.size() % 2 != 0) {
			stack.remove(stack.size() / 2);
		}else {
			stack.remove((stack.size() / 2) - 1);
		}
		return stack;
	}

}
