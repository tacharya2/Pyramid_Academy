package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class FindTheLastIndexInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>(List.of(2, 3, 6, 5, 5, 6, 8, 56, 9, 45, 9));
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		System.out.println(solution(list2, 9));

	}

	public static int solution(ArrayList<Integer> list, int num) {
		int index = 0;

		if (list.isEmpty()) {
			return -1;
		}

		if (!list.contains(num)) {
			return -1;
		} else {

			int found = list.lastIndexOf(num);

			return found;
		}

	}

}
