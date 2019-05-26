package chapter7;

class Text15{
    protected void f() {
        System.out.println("this is f()");
    }
}

class Newtest extends Text15{
    public void g() {
        f();
    }
}
public class EX15 {

    public static void main(String[] args) {
        Newtest n = new Newtest();
        n.g();
    }

} /* Output
this is f()
*///:~
