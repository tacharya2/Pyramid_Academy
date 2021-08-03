package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;

public class MeanMedianof3Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meanMedianSum(5, 3, 4);
	}

	public static int meanMedianSum(int a, int b, int c) {

		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		list.sort(null);
		System.out.println(list);

		int median = list.get(1);
		System.out.println(median);

		return 1;
	}

}
