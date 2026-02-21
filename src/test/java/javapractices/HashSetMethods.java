package javapractices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetMethods {

	public static void main(String[] args) {

		HashSet<Integer> l1 = new HashSet<Integer>();

		// add element in list
		l1.add(10);
		l1.add(20);
		l1.add(30);

		// add element at specific index
		// l1.add(2, 25);

		for (Integer i : l1) {
			System.out.println(i);
		}

		System.out.println("###############################################");

		HashSet<Integer> l2 = new HashSet<Integer>();
		l2.add(100);
		l2.add(200);

		l1.addAll(l2);

//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}
		System.out.println("###############################################");
		System.out.println("Size of list = " + l1.size());

		System.out.println("###############################################");

		// l1.clear();

		System.out.println("Size of list = " + l1.size());

		System.out.println("###############################################");

		System.out.println("L1 constains 200 = " + l1.contains(200));
		System.out.println("L1 constains 2000 = " + l1.contains(2000));

		System.out.println("###############################################");

		System.out.println("L1 constains L2 = " + l1.containsAll(l2));

		System.out.println("###############################################");
//		System.out.println("Element from index 4 = " + l1.get(4));
//		System.out.println("Element from index 3 = " + l1.get(3));

		System.out.println("###############################################");

//		System.out.println("First index element = " + l1.getFirst());
//		System.out.println("Last index element = " + l1.getLast());

		System.out.println("###############################################");

		System.out.println("L1 is empty = " + l1.isEmpty());
		// l1.clear();
		// System.out.println("L1 is empty = " + l1.isEmpty());

		System.out.println("###############################################");
//		l1.remove(0);
//		System.out.println(l1);
//		l1.removeFirst();
//		System.out.println(l1);
//		l1.removeFirst();
//		System.out.println(l1);
//		l1.removeAll(l2);
//		System.out.println(l1);

		System.out.println("###############################################");

//		List<Integer> l3 = l1.reversed();
//		System.out.println(l3);

		System.out.println("###############################################");
//		l1.set(2, 250);
		System.out.println(l1);

		System.out.println("###############################################");

//		l1.sort((a, b) -> a - b);
		System.out.println(l1);
//		l1.sort((a, b) -> b - a);
		System.out.println(l1);

//		l1.sort(new Comparator<Integer>() {

//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1 - o2;
//			}
//
//		});

//		System.out.println(l1);

//		Collections.sort(l1);

		List<Integer> l5 = l1.stream().sorted((a, b) -> a - b).filter(a -> a > 100).map(a -> a * 10)
				.collect(Collectors.toList());
		System.out.println("L5 = " + l5);
		System.out.println("###############################################");

//		List<Integer> l4 = l1.subList(2, 5);
//		System.out.println(l4);
//		l4 = l1.subList(2, 6);
//		System.out.println(l4);

		System.out.println("###############################################");

		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			Integer ii = it.next();
			if (ii > 200) {
				it.remove();
				continue;
			}

			System.out.println(ii);

		}

	}

}
