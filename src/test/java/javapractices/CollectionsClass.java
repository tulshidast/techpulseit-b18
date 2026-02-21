package javapractices;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		// add element in list
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(100);
		l1.add(20);
		l1.add(300);

		System.out.println(Collections.min(l1));
		System.out.println(Collections.max(l1));
		Collections.sort(l1);

		System.out.println(l1);

		Collections.reverse(l1);

		System.out.println(l1);
		

	}

}