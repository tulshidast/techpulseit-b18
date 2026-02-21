package javapractices;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CharacterCountUsingMap {

	public static void main(String[] args) {

		String s = "Welcome to codedisha";

		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (!(linkedHashMap.containsKey(s.charAt(i)))) {
				linkedHashMap.put(s.charAt(i), 1);
			} else {
				linkedHashMap.put(s.charAt(i), linkedHashMap.get(s.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> ss = linkedHashMap.entrySet();

		for (Entry<Character, Integer> e : ss) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
