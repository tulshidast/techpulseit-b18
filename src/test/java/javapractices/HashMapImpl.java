package javapractices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapImpl {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();

		h.put(1, "sachin");
		h.put(5, "nitin");
		h.put(3, "vikas");
		h.put(7, "vilas");

		h.put(1, "virat");
		h.put(null, "hardik");
		h.put(10, null);
		h.put(11, null);

		System.out.println(h);

		System.out.println("#####################################################");

		LinkedHashMap<Integer, String> h2 = new LinkedHashMap<Integer, String>();

		h2.put(1, "sachin");
		h2.put(5, "nitin");
		h2.put(3, "vikas");
		h2.put(7, "vilas");

		h2.put(1, "virat");
		h2.put(null, "hardik");
		h2.put(10, null);
		h2.put(11, null);

		System.out.println(h2);
		System.out.println("#####################################################");

		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();

		t1.put(1, "sachin");
		t1.put(5, "nitin");
		t1.put(3, "vikas");
		t1.put(7, "vilas");

		t1.put(1, "virat");
		// t1.put(null, "hardik");
		t1.put(10, null);
		t1.put(11, null);

		System.out.println(t1);

	}

}
