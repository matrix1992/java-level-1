package com.tower.java.examples.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomAnnotation("some_marker")
public class CustomAnnotationExample {

	@CustomAnnotationWithDefault
	public void method() {
		// do something
	}
	
	@CustomMethodAnnotation("some_marker")
	public void secondMethod() {
		// do something
	}
	
	@RetainedAnnotation
	public void thirdMethod() {
		// do something else
	}
}

// custom annotation
@interface CustomAnnotation {
	String value();
}

// annotation with default value
@interface CustomAnnotationWithDefault {
	String value() default "default";
}


// annotation that can only be applied to methods
@Target({ElementType.METHOD})
@interface CustomMethodAnnotation {
	String value();
}

// these annotations will work on runtime as well
// used widely in multiple libraries with reflection
// to provide dynamic bindings
@Retention(RetentionPolicy.RUNTIME)
@interface RetainedAnnotation {
	String value() default "";
}