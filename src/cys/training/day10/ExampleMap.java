package cys.training.day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleMap {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("a", new Integer(100));
		hm.put("h", new Integer(20));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			System.out.println(me.getKey() + ":" + me.getValue());
		}

		/*
		 * LinkedHashMap is just like HashMap with an additional feature of maintaining
		 * an order of elements inserted into it. HashMap provided the advantage of
		 * quick insertion, search, and deletion
		 */
		Map<String, Integer> map = new LinkedHashMap<>();

		// Inserting pair entries in above Map
		// using put() method

		map.put("vishal", 10);
		map.put("Abi", 35);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : map.entrySet())

			System.out.println("Linked HashMap"+e.getKey() + " " + e.getValue());

		// TreeMap

		// Creating an empty TreeMap
		Map<String, Integer> treemap = new TreeMap<>();

		// Inserting custom elements in the Map
		// using put() method
		treemap.put("vishal", 10);
		treemap.put("banu", 5);
		//map - duplicate values - overrides-key
		treemap.put("banu", 30);
		treemap.put("bhargav", 25);
		treemap.put("vaibhav", 20);

		// Iterating over Map using for each loop
		for (Map.Entry<String, Integer> e : treemap.entrySet())

			// Printing key-value pairs
			System.out.println("Tree Map"+e.getKey() + " " + e.getValue());
	}
}
