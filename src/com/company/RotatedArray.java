package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class RotatedArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6));
		int n = 1;

		System.out.println(solution(list, n));

	}

	public static List<Integer> solution(List<Integer> list, int num) {

		List<Integer> lst = new ArrayList<Integer>();

		for (int i = ((list.size()) - num); i < list.size(); i++) {

			lst.add(list.get(i));
		}

		if (num < list.size()) {
			for (int i = 0; i < list.size() - num; i++) {

				lst.add(list.get(i));
			}
		}
		return lst;
	}
}
