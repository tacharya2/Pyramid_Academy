package pyramidAcademy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class SortTheStack {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> lst = new ArrayList<>(List.of(1, 5, 6, 7, 9, 4, 13, 158, -26, 0));
		stack.addAll(lst);
		System.out.println(solution(stack));

	}

	public static Stack<Integer> solution(Stack<Integer> stack) {
		ArrayList<Integer> list = new ArrayList<>();
		if (stack.size() <= 1) {
			return stack;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}

		list.sort(Comparator.reverseOrder());


		stack.addAll(list);
		return stack;
	}

}
