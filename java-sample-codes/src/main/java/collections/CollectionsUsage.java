package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsUsage {
	private List elementList = new ArrayList();
	private Map elementMap = new HashMap();
	
	private void showExample() {
		showListExample();
	}

	private void showListExample() {
		// add elements
		elementList.add("first element");
		elementList.add("second element");
		elementList.add("third element");
		
		printElementList();
		
		// index based access
		String item = (String) elementList.get(0);
		
		// remove element based on index
		elementList.remove(0);
		
		// remove element based on content
		elementList.remove("second element");
		
		printElementList();
	}
	
	private void printElementList() {
		// access via for each loop
//		for(String element : elementList) {
//			System.out.println(element);
//		}
		
		
		// access via iterator
		Iterator iterator = elementList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	private void showMapExample() {
		// add elements
		elementMap.put("first", "first element");
		elementMap.put("second", "second element");
		elementMap.put("third", "third element");
		
		// random access based on Key
		String item = (String) elementMap.get("first");
		
		// remove element based on key
		elementList.remove("first");
	}
	
	public static void main(String[] args) {
		new CollectionsUsage().showExample();
	}
}

/*
 * read about hashcode() and equals() method
 */
