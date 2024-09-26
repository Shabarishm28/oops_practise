package oopsPractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("A", 1);
		hs.put("B", 2);
		hs.put("C", 1);
		hs.put("D", 3);
		hs.put("E", 3);

		Set<Integer> duplicate = new HashSet<>();

		for (Entry<String, Integer> hs1 : hs.entrySet()) {

			int value = hs1.getValue();
			String key = hs1.getKey();

			if (!duplicate.add(value)) {
				System.out.println("The duplicate value " + value + " at index " + key);
			}

		}
		
		Set<Integer> duplicate1 = new HashSet<>();
		Set s1 = hs.entrySet();
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			
			Entry<String, Integer> hs3 = (Entry<String, Integer>) it.next();
			if(!duplicate1.add(hs3.getValue())) {
				System.out.println("The duplicate value "+hs3.getValue() + " at index " + hs3.getKey());
			}
		}

	}

}
