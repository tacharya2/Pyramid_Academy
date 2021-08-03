package pyramidAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add1ToArrayListst {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>(List.of(1, 0, 9)); // 123 + 1
																	// [1, 0, 0, 0]
		System.out.println(solution(lst));
		;
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> list) {
		String s = "";

		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		System.out.println(s);
		Integer num = Integer.parseInt(s);
		num += 1;

		System.out.println(num);

		while (num > 0) {
			l.add(num % 10);
			num /= 10;
		}
		// 1000 % 10 = 0,0,0,1

		Collections.reverse(l);

		return l;
	}
}
