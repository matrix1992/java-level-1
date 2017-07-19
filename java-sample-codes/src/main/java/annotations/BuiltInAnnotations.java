package com.tower.java.examples.annotations;

import com.sun.istack.internal.NotNull;

public class BuiltInAnnotations {

	@Deprecated
	public int myOldMethod() {
		// not used anymore
		return 0;
	}
	
	@SuppressWarnings("null")
	public void methodWithWarning() {
		Object obj = null;
		obj.toString();
	}
	
	private class Child implements IBase {
		@Override
		public void someMethod() {
			// some code
		}
		
		@Override
		public void somemethod() {
			// compile error
		}
	}
	
	private interface IBase {
		void someMethod();
	}
}
