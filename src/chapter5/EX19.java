package chapter5;


public class EX19 {
    static void f(String... args) {
        for(String a:args)
            System.out.println(a);
    }
    public static void main(String[] args) {
        f("a","b","c");
        String[] s = {"d","e","f"};
        f(s);
    }

} /*
a
b
c
d
e
f
*///:~
