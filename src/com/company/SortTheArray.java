package pyramidAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheArray {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>(List.of(-1, 8, 2, 9, 4, 3, 6, -7));
		System.out.println(solution(lst));
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> list) {

		Collections.sort(list);
		return list;
	}

}
