package javapractices;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>();

		s.add(10);
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(null);

		for (Integer i : s) {
			System.out.println(i);
		}

	}

}
