package basics;

public enum EnumDemo {
    
    INSTANCE;
    
    // define the methods
    public void printHashCode() {
        System.out.println(this.hashCode());
    }
    
    public static void main(String[] args) {
        EnumDemo ed1 = EnumDemo.INSTANCE;
        ed1.printHashCode();
        EnumDemo ed2 = EnumDemo.INSTANCE;
        ed2.printHashCode();
    }

}
