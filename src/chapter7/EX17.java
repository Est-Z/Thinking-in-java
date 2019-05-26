package chapter7;

class Amphibian1{
    public void eat() {
        System.out.println("Amphibian eat");
    }
}

class Frog1 extends Amphibian1{
    @Override
    public void eat() {
        System.out.println("Frog eat");
    }
}

public class EX17 {
    
    public static void life1(Amphibian1 i) {
        i.eat();
    }
    public static void main(String[] args) {
        Frog1 f = new Frog1();
        life1(f);
    }

} /* Output
Frog eat
*///:~