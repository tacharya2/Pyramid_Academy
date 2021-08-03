package pyramidAcademy;

import java.util.Stack;

public class DeleteInnerElementUsingStack {

	public static void main(String[] args) {
		Stack stak = new Stack();
		for (int i = 1; i < 2; i++) {
			stak.push(i);
		}
		System.out.println(solution(stak));
	}

	public static Stack solution(Stack stack) {
		if ((stack.size() % 2) != 0) {
			// stack.remove((stack.size() / 2));
			stack.remove((stack.size() / 2));
			return stack;
		} else {
			stack.remove((stack.size() / 2) -1);
			// System.out.println(stack.remove(stack.size() - 2));
			return stack;
		}
	}
}
