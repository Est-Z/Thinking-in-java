package chapter5;

class Test14{
    static String str1 = "i am str1!";
    static String str2;
    static {
        str2 = "i am str2!";
    }
    
    static void print() {
        System.out.println(str1 + " " + str2);
    }
}
public class EX14 {

    public static void main(String[] args) {
        Test14.print();
    }

} /*
i am str1! i am str2!
*///:~
