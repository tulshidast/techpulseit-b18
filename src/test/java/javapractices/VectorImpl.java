package javapractices;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(20);
		v.add(10);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(null);

		for (Integer i : v) {
			System.out.println(i);
		}

	}

}
