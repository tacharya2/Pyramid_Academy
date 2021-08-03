package pyramidAcademy;

import java.util.HashMap;

public class GetAllKeys {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("first", 1);
		hm.put("second", 3);
		hm.put("third", 5);
		hm.put("", 1);
		solution(hm);

	}

	public static void solution(HashMap<String, Integer> map) {

			System.out.println(map.keySet());

	}
}
