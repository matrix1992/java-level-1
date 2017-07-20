package generics;

import java.util.ArrayList;

public class GenericClassAndMethod {

	private Container<String> myStringContainer = new Container<>();
	private Container<Integer> myIntContainer = new Container<>();
	
	public void showExample() {
		myIntContainer.add(0);
//		myIntContainer.add("something");
		
		myStringContainer.add("something");
//		myStringContainer.add(0);
	}
}

class Container<T> {
	ArrayList<T> items;

	public void add(T item) {
		if (!items.contains(item)) {
			items.add(item);
		}
	}

	public void remove(T item) {
		if (items.contains(item)) {
			items.remove(item);
		}
	}

	public T getFirst() {
		if (items.size() != 0) {
			return items.get(0);
		} else {
			return null;
		}
	}

	public T getLast() {
		if (items.size() != 0) {
			return items.get(items.size() - 1);
		}

		return null;
	}
}