package pyramidAcademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingLink {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(14, 45, 69, 23, 81, 478, 1));

		System.out.println(solution(list));
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> nums) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i < 101; i++) {
			set.add(i);
		}
		for (int i = 0; i < nums.size(); i++) {
			if (set.contains(nums.get(i))) {
				set.remove(nums.get(i));
			}
		}
		ArrayList<Integer> l = new ArrayList<>();
		l.addAll(set);

		return l;
	}
}
