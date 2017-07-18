package basics;

public class StringDemo {
    
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        String c = new String("Hello"); // Never use this. Forces a new object
        System.out.println(a == c);
        
        String str1 = "Hello" + " World" + "!!!";
        String str2 = "Hello".concat("World").concat("!!!"); // HelloWorld, HelloWorld!!!
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        sb.append("!!!");
        
        String str3 = sb.toString();
    }

}
