package chapter7;

class Amphibian{
    public void eat() {
        System.out.println("Amphibian eat");
    }
}

class Frog extends Amphibian{

}

public class EX16 {
    
    public static void life(Amphibian i) {
        i.eat();
    }
    public static void main(String[] args) {
        Frog f = new Frog();
        life(f);
    }

} /* Output
Amphibian eat
*///:~
