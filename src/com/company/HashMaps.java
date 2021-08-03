package pyramidAcademy;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(3, 6);
		map.put(5, 9);
		map.put(7, 12);
		System.out.println(map);
		int m = solution(map, 3);
		System.out.println(m);

	}

	public static int solution(HashMap<Integer, Integer> map, Integer value) {
		int m = map.get(value);
		return m;
	}

}
