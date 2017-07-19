package generics;

import java.util.HashMap;
import java.util.Map;

public class TypeErasureExample {
	private Map<String, String> genericsMap = new HashMap<>();
    private Map noGenericsMap = new HashMap();
}


/*


//Compiled from TypeErasureExample.java (version 1.7 : 51.0, super bit)
public class com.tower.java.examples.generics.TypeErasureExample {

// Field descriptor #6 Ljava/util/Map;
// Signature: Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
private java.util.Map genericsMap;

// Field descriptor #6 Ljava/util/Map;
private java.util.Map noGenericsMap;

// Method descriptor #11 ()V
// Stack: 3, Locals: 1
public TypeErasureExample();
  0  aload_0 [this]
  1  invokespecial java.lang.Object() [13]
  4  aload_0 [this]
  5  new java.util.HashMap [15]
  8  dup
  9  invokespecial java.util.HashMap() [17]
 12  putfield com.tower.java.examples.generics.TypeErasureExample.genericsMap : java.util.Map [18]
 15  aload_0 [this]
 16  new java.util.HashMap [15]
 19  dup
 20  invokespecial java.util.HashMap() [17]
 23  putfield com.tower.java.examples.generics.TypeErasureExample.noGenericsMap : java.util.Map [20]
 26  return
   Line numbers:
     [pc: 0, line: 6]
     [pc: 4, line: 7]
     [pc: 15, line: 8]
     [pc: 26, line: 6]
   Local variable table:
     [pc: 0, pc: 27] local: this index: 0 type: com.tower.java.examples.generics.TypeErasureExample
}


*/