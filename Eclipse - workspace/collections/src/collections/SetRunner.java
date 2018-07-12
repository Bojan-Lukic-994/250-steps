package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet " + treeSet);
		
		Set<Character> likedHashSet = new LinkedHashSet<>(characters);
		System.out.println("likedHashSet " + likedHashSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet " + hashSet);
	}

}
