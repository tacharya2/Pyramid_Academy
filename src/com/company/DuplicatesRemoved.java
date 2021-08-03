package pyramidAcademy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicatesRemoved {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 1, 1, 1, 5, 6, 3, 2, 3, 6, 5, 4, 8, 9, 7, 5, 1, 10, 2, 3, 5, 6 };
//			System.out.println(solution(arr));
		solution(arr);
	}
	 public static int[] solution(int[] nums){
		 
		Set<Integer> set = new HashSet<Integer>();
		for (int e : nums) {
			set.add(e);
		}
		System.out.println(set);

		int[] noDuplicates = new int[set.size()];

		Iterator<Integer> iter = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			noDuplicates[i] = iter.next();
		}
		return noDuplicates;
	 }
}
