package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + "This has never happened before.";

		Map<Character, Integer> finder = new HashMap<>();

		char[] characters = str.toCharArray();

		// finds the number of each letter in the sentence
		for (char character : characters) {
			Integer integer = finder.get(character);
			if (integer == null) {
				finder.put(character, 1);
			} else {
				finder.put(character, integer + 1);
			}
		}
		System.out.println(finder);


		Map<String, Integer> stringFinder = new HashMap<>();

		String[] words = str.split(" ");

		// finds the number of each word in the sentence
		for (String word : words) {
			Integer integer = stringFinder.get(word);
			if (integer == null) {
				stringFinder.put(word, 1);
			} else {
				stringFinder.put(word, integer + 1);
			}
	}

		System.out.println(stringFinder);
	}
}
