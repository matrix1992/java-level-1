package memory;

public class MemoryCreation {

	private void foo(Object somePara) {
		String str = somePara.toString();
	}
	
	private void memoryModel() {
		int val = 1;
		Object obj = new Object();
		foo(obj);
	}
	
	public static void main(String[] args) {
		new MemoryCreation().memoryModel();
	}
}

/*
 memory model stack:
 	val = 1
 	obj -> reference to heap allocation

 foo method stack:
 	str -> reference to String pool item
 	somePara -> reference to heap allocation
 	
 heap info:
 	Obj / somePara -> actual memory allocation
 	String Poll:
 		actual string for str
*/

// further read : Java memory model -> eden age, old memory and perm memory
