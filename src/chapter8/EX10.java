package chapter8;

class Bird {
    void fly() { System.out.println("I can fly by " + wingNum() + " wings");}
    int wingNum() { return 2; }
}

class Butterfly extends Bird{
    @Override
    int wingNum() { return 4; }
}
public class EX10 {
    public static void frighten(Bird b) {
        b.fly();
    }
    public static void main(String[] args) {
        Butterfly butt = new Butterfly();
        frighten(butt);
    }

} /* Output
I can fly by 4 wings
*///:~
