package javapractices;

import java.util.ArrayDeque;

public class ArrayDequeImpl {

	public static void main(String[] args) {

		ArrayDeque<Integer> s = new ArrayDeque<>();

		s.add(10);
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(50);
		// s.add(null);

		for (Integer i : s) {
			System.out.println(i);
		}

	}

}
