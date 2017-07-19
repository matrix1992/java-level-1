package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards {

	List<GrandFather> grandFatherList = new ArrayList<>();
	List<Father> fatherList = new ArrayList<>();
	List<Son> sonList = new ArrayList<>();
	
	// list is unknown so we cannot type cast (**should not**)
	public void processItems(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	// only certainty is they have all the method available to grandfather
	public void doSomething(List<? extends GrandFather> list) {
		for(GrandFather gf : list) {
			gf.doSomething();
		}
	}
	
	// this list is either grandfather type or it's super class's type
	// means it can hold grandfather and all the child objects
	public void addItems(List <? super GrandFather> list) {
		list.add(new Son());
		list.add(new Father());
		list.add(new GrandFather());
	}
}

class GrandFather {
	public void doSomething() {

	}
}

class Father extends GrandFather {
	public void doSomethingElse() {

	}
}

class Son extends Father {
	public void dontDoAnything() {

	}
}