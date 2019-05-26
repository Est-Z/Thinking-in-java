package chapter7;

class D{
    D(int i){  System.out.println("D constructor");}
}

class E{
    E(int i){  System.out.println("E constructor");}
}

class F extends D{
    E e = new E(1);
    F(){
        super(1);
        System.out.println("F constructor");
    }
}

public class EX07 {

    public static void main(String[] args) {
        F f = new F();
    }

} /* Output
D constructor
E constructor
F constructor
*///:~
