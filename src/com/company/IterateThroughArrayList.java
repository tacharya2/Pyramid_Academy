package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;


public class IterateThroughArrayList {
	public static void main(String[] args) {

		System.out.println(solution(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6))));
		System.out.println(solution(new ArrayList<>(List.of(2))));
		System.out.println(solution(new ArrayList<>(List.of())));
		System.out.println(solution(new ArrayList<>(List.of(-1, -1, -2, -5))));
		System.out.println(solution(new ArrayList<>(List.of(1, 1, 1, 1, 1, 1))));
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> list) {

		ArrayList<Integer> lst = new ArrayList<Integer>();
		if (list.isEmpty()) {
			return list;
		} else {
			for (int i = 0; i < list.size(); i++) {
				lst.add(list.get(i));
			}
			return lst;
		}
		}
	}
