package pyramidAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add1ToArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lst1 = new ArrayList<>(List.of(5, 5, 9));

		ArrayList<Integer> lst2 = new ArrayList<>(lst1);
		System.out.println(solution(lst2));

	}

	public static ArrayList<Integer> solution(ArrayList<Integer> list) {

		String str = "";
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
	for(int i = 0; i < list.size(); i++) {
		str += list.get(i);
	}
	
	int num = Integer.parseInt(str);
	num++;
		System.out.println(num);
		while (num > 0) {
			lst.add(num % 10);
			num /= 10;
		}

		Collections.reverse(lst);
		return lst;	
	}
}