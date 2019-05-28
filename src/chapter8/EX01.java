package chapter8;




class Cycle{
    void ride() {
        System.out.println("ride Cycle!");
    }
}
class Unicycle extends Cycle{
    @Override
    void ride() {
        System.out.println("ride Uniycle!");
    }
}
class Bicycle extends Cycle{
    @Override
    void ride() {
        System.out.println("ride Bicycle!");
    }
}
class Tricycle extends Cycle{
    @Override
    void ride() {
        System.out.println("ride Tricycle!");
    }
}
public class EX01 {
    
    public static void by(Cycle c) {
        c.ride();
    }
    public static void main(String[] args) {
        by(new Cycle());
        by(new Unicycle());
        by(new Bicycle());
        by(new Tricycle());
    }

} /* Output
ride Cycle!
ride Uniycle!
ride Bicycle!
ride Tricycle!
*///:~
