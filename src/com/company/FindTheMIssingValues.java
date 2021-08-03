package pyramidAcademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindTheMIssingValues {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 5, 9));
		ArrayList<Integer> lst = new ArrayList<>(list);

		System.out.println(solution(lst));

	}

	public static ArrayList<Integer> solution(ArrayList<Integer> nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 1; i < 11; i++) {
			set.add(i);
		}

		ArrayList<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			if (set.contains(nums.get(i))) {
				set.remove(nums.get(i));
			}


			}
		Iterator<Integer> iter = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			l.add(iter.next());
		}

		return l;
	}

}
