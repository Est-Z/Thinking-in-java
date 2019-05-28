package chapter8;

class Cycle1{
    void ride() {
        System.out.println("ride Cycle! The whell is:" + this.whell());
    }
    int whell() {
        return 0;
    }
}
class Unicycle1 extends Cycle1{
    @Override
    void ride() { System.out.println("ride Uniycle! The whell is:" + this.whell()); }
    @Override
    int whell() { return 1; }
}
class Bicycle1 extends Cycle1{
    @Override
    void ride() { System.out.println("ride Bicycle! The whell is:" + this.whell()); }
    @Override
    int whell() { return 2; }
}
class Tricycle1 extends Cycle1{
    @Override
    void ride() { System.out.println("ride Tricycle! The whell is:" + this.whell()); }
    @Override
    int whell() { return 3; }
}


public class EX05 {

    public static void by1(Cycle1 c) {
        c.ride();
    }
    public static void main(String[] args) {
        by1(new Cycle1());
        by1(new Unicycle1());
        by1(new Bicycle1());
        by1(new Tricycle1());
    }

} /* Output
ride Cycle! The whell is:0
ride Uniycle! The whell is:1
ride Bicycle! The whell is:2
ride Tricycle! The whell is:3
*///:~

