package chapter7;

class Test23{
    static {
        System.out.println("Class Test23 Loading...");
    }
    static void load() {}
}
public class EX23 {
    public static void main(String[] args) {
        System.out.println("Calling static load");
        Test23.load();
        System.out.println("Creating an object");
        new Test23();
    }

} /* Output
Calling static load
Class Test23 Loading...
Creating an object
*///:~
