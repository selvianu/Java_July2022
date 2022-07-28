package cys.training.day9;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleSet {

	/*
	 * A set is an unordered collection of objects in which duplicate values cannot
	 * be stored. Set hs = new HashSet (); Set lhs = new LinkedHashSet (); Set ts =
	 * new TreeSet ();
	 */
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(101);
		hs.add(201);
		System.out.println(hs);
		hs.add(102);// Overrides
		System.out.println(hs);

		Iterator setElements = hs.iterator();
		{
			while (setElements.hasNext())
				System.out.println(setElements.next());
		}
	}

}
