package pyramidAcademy;

import java.util.HashMap;

public class MapPrintKeys {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("J", -3);
		map.put("biucbsa", 3);
		map.put(" sibs", 11);
		map.put("Joy", 16);
		map.put("Jamin", 100);
		solution(map);

	}

	public static void solution(HashMap<String, Integer> map) {

		for (var k : map.values()) {
			System.out.println(k);
		}
		for (var k : map.keySet()) {
			System.out.println(k);
		}

	}

}
