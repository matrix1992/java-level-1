package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

	@RetainedAnnotation("one")
	public void thirdMethod() {
		// do something else
	}

	@RetainedAnnotation("two")
	public void fourthMethod() {
		// do something else
	}
}

class SomeOtherClass {
	public void executeRetainedMethod(String value) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<CustomAnnotation> annotationClass = CustomAnnotation.class;
		Method[] methods = annotationClass.getMethods();
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();

			for (Annotation annotation : annotations) {
				if (annotation instanceof RetainedAnnotation) {
					if (((RetainedAnnotation) annotation).value().equals(value)) {
						// execute this method
						CustomAnnotation obj = annotationClass.newInstance();
						method.invoke(obj);
					}
				}
			}
		}
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
@Target({ ElementType.METHOD })
@interface CustomMethodAnnotation {
	String value();
}

// these annotations will work on runtime as well
// used widely in multiple libraries with reflection
// to provide dynamic bindings
@Retention(RetentionPolicy.RUNTIME)
@interface RetainedAnnotation {
	String value();
}