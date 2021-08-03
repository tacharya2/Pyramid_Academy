package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class FindMissingValues2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 34, 56, 78, 90, 92));
		ArrayList<Integer> lst = new ArrayList<>(list);

		System.out.println(solution(lst));
//		solution(list);
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> nums) {
		ArrayList<Integer> blanklist = new ArrayList<>();
		
		ArrayList<Integer> list100 = new ArrayList<>();
		
		for (int i = 1; i < 101; i++) {
			list100.add(i);
		}
//		System.out.println(list100);
		
		int j = nums.get(0);
		for (int i = 0; i < 100; i++) {

			if (j == nums.get(i)) {
				j++;
				continue;
			} else {
				blanklist.add(j);
				i--;
				j++;
			}
		}

		return blanklist;
	}

}
