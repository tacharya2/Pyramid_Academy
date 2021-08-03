package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;


public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 45, 50, 60));
		ArrayList<Integer> lst = new ArrayList<>(list);
		solution(lst);
	}

	public static ArrayList<Integer> solution(ArrayList<Integer> list) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for (int i = 3; i < list.size(); i++) {
			lst.add(list.get(i));
		}
		System.out.println(lst);

		for (int i = 0; i < 3; i++) {
			lst.add(list.get(i));
		}
		System.out.println(lst);
		return lst;
	}
}
