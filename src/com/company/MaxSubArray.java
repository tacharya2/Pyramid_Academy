package pyramidAcademy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSubArray {

	public static void main(String[] args) {

//		ArrayList<Integer> lst1 = new ArrayList<>(List.of(1, -2, -3, 4));
//		ArrayList<Integer> lst2 = new ArrayList<>(lst1);
//		System.out.println(solution(lst2));
////
		ArrayList<Integer> lst3 = new ArrayList<>(List.of(-1, -1, 1));
		ArrayList<Integer> lst4 = new ArrayList<>(lst3);
		System.out.println(solution(lst4));
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> nums) {

		ArrayList<Integer> list = new ArrayList<>(nums);


		nums.sort(Comparator.reverseOrder());


		Set<Integer> set = new HashSet<>();

		if (nums.size() == 0) {
			return null;
		} else {
		Integer sum = nums.get(0);
		set.add(nums.get(0));
		for (int i = 1; i < nums.size(); i++) {
			if (sum + nums.get(i) > sum) {
				set.add(nums.get(i));
				sum += nums.get(i);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (!set.contains(list.get(i))) {
				list.remove(list.get(i));
					if (!set.contains(list.get(i))) {
						list.remove(list.get(i));
					}
			}
		}

		return list;
		}
	}

}
