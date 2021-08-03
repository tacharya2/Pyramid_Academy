package pyramidAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFun {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 56, 7));
		int[] arr = new int[10];
		list.add(45);
		list.remove(4);
		System.out.println(list);
		int num = list.get(4);
		System.out.println(num);

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
