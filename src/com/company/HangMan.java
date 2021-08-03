package pyramidAcademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("Mama", "Papaya", "Monkey", "America", "Kaka", "Himalaya",

				"Dog", "Puppy", "Everest", "Buddha"));

		int random = 0;
		String s = "";
		int dashes = 0;
		int min = 0;
		int max = 10;
		for (int i = min; i < max; i++) {
			random = (int) (Math.random() * (max - min)) + min;
			s = list.get(random);
			dashes = s.length();
		}

		ArrayList<Character> characterList = new ArrayList<>();
		for (int i = 0; i < dashes; i++) {
			characterList.add(s.charAt(i));
		}
		System.out.println(characterList);
		System.out.println(random);
		System.out.println(s);
		System.out.println(dashes);

		solution(random, s, dashes);
		missed(dashes, characterList);

	}

	public static void solution(int random, String s, int dashes) {
		System.out.println("HANGMAN");
		System.out.println("+---+");
		for (int i = 0; i < dashes; i++) {
			System.out.println("   |");
		}
		System.out.println("  ===");
		System.out.println("Missed Letter: ");
		System.out.println("Guessed Letters: ");

	}

	public static void missed(int dashes, ArrayList<Character> characterList) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter you guess (One chcacter at a time): ");
		char c = s.nextLine().charAt(0);

		for (int i = 0; i < dashes; i++) {
			if (characterList.get(i) == c) {
				characterList.remove(characterList.get(i));
			}
		}
		System.out.println(characterList);

	}
}
