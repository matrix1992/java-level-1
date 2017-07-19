package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicGeneric {
	private List<String> elementList = new ArrayList<>();

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
		// access via iterator
		Iterator<String> iterator = elementList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		new BasicGeneric().showListExample();
	}
}
