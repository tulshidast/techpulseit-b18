package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {

		TreeSet<Integer> t1 = new TreeSet<Integer>();

		t1.add(10);
		t1.add(20);
		t1.add(15);
		t1.add(30);

		TreeSet<Integer> t2 = new TreeSet<Integer>();

		t2.add(100);
		t2.add(200);

		t1.addAll(t2);

		for (Integer i : t1) {
			System.out.println(i);
		}

		System.out.println("###################################################");

		System.out.println("t1 contains 200 = " + t1.contains(200));
		System.out.println("t1 contains 200 = " + t1.contains(2000));

		System.out.println("###################################################");

		System.out.println("t1 contains t2 = " + t1.containsAll(t2));

		System.out.println("###################################################");

		System.out.println(t1.floor(100));
		System.out.println(t1.floor(30));
		System.out.println("###################################################");
		System.out.println(t1.getFirst());
		System.out.println(t1.getLast());
		System.out.println("###################################################");
		System.out.println("t1 is empty = " + t1.isEmpty());
		System.out.println("###################################################");
		System.out.println("t1 size = " + t1.size());
		System.out.println("###################################################");
		System.out.println(t1.subSet(10, 100));
		System.out.println("###################################################");
		System.out.println(t1.reversed());
		System.out.println("###################################################");
		Iterator<Integer> it = t1.descendingIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("###################################################");
		Iterator<Integer> it2 = t1.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
