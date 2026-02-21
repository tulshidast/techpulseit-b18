package javapractices;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapMethods {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
		hmap.put(10, "sachin");
		hmap.put(20, "rahul");
		hmap.put(40, "virat");
		hmap.put(30, "ravindra");

		LinkedHashMap<Integer, String> hmap2 = new LinkedHashMap<Integer, String>();
		hmap2.put(100, "hardik");
		hmap2.put(200, "sourav");

		hmap.putAll(hmap2);

		System.out.println(hmap);

		System.out.println("#############################################################");
		System.out.println("40 key is there = " + hmap.containsKey(40));
		System.out.println("rahul value is there = " + hmap.containsValue("rahul"));

		System.out.println("400 key is there = " + hmap.containsKey(400));
		System.out.println("rahulk value is there = " + hmap.containsValue("rahulk"));

		System.out.println("#############################################################");
		System.out.println("value belong to key 100 is  = " + hmap.get(100));

		System.out.println("#############################################################");
		System.out.println("hmap is empty  = " + hmap.isEmpty());

		System.out.println("#############################################################");
		Set<Integer> set = hmap.keySet();

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("#############################################################");

		Collection<String> cl = hmap.values();

		Iterator<String> it2 = cl.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println("#############################################################");

		System.out.println("size of hmap  = " + hmap.size());

		System.out.println("#############################################################");
		hmap.remove(100);
		hmap.remove(200, "sourav");

		System.out.println(hmap);
		hmap.replace(20, "rishbh");
		System.out.println(hmap);
		hmap.replace(30, "ravindra", "shivam");
		System.out.println(hmap);

		System.out.println("#############################################################");

		Set<Entry<Integer, String>> se = hmap.entrySet();

		Iterator<Entry<Integer, String>> it3 = se.iterator();

		while (it3.hasNext()) {
			Entry<Integer, String> e2 = it3.next();
			System.out.println(e2.getKey() + " : " + e2.getValue());
		}

		System.out.println("#############################################################");

		for (Entry<Integer, String> e : se) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("#############################################################");

		se.forEach((e) -> System.out.println(e.getKey() + " : " + e.getValue()));

		System.out.println("#############################################################");

		hmap.clear();
		System.out.println(hmap.size());

	}

}
