package chapter5;

class Test8{
    public void eat() {
        apple();
        this.apple();
    }
    public void apple() {
        System.out.println("又红又大的苹果");
    }
}
public class EX08 {

    public static void main(String[] args) {
        Test8 t = new Test8();
        t.eat();
    }

} /*
又红又大的苹果
又红又大的苹果
*///:~
