package pyramidAcademy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// creating an object of ArrayList

		int[] arr = new int[] { 3, -3, 9, 10, 15, 19, 12 }; // length

		ArrayList<Integer> list = new ArrayList<>();// [3, -3, 9, 10, 15, 19, 11]
		for (int e : arr) {
			list.add(e);
		}

		for (int i = 0; i < list.size(); i++) {

		}

		Collections.sort(list);
		System.out.println(list);

		int min = list.get(0);
		System.out.println(min);

		int max = list.get(list.size() - 1);
		System.out.println(max);
	}
}
