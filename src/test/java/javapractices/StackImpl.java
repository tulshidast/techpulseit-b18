package javapractices;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();

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
