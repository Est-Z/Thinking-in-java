package chapter7;

class A{
    A(){
        System.out.println("A constructor");
    }
}

class B{
    B(){
        System.out.println("B constructor");
    }
}

class C extends A{
    B b = new B();
}
public class EX05 {

    public static void main(String[] args) {
        C c = new C();
    }

} /* Output
A constructor
B constructor
*///:~
