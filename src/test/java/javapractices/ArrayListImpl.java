package javapractices;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(null);

		for (Integer i : list) {
			System.out.println(i);
		}

	}

}
