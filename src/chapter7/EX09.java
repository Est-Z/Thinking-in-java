package chapter7;

class Component1{ Component1(){ System.out.println("Component1 constructor"); } }
class Component2{ Component2(){ System.out.println("Component2 constructor"); } }
class Component3{ Component3(){ System.out.println("Component3 constructor"); } }

class Root{
    Root(){
        System.out.println("Root constructor");
    }
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}

class Stem extends Root{
    Component3 c3 = new Component3();
    Component2 c2 = new Component2();
    Component1 c1 = new Component1();
    Stem(){
        System.out.println("Stem constructor");
    }
}
public class EX09 {

    public static void main(String[] args) {
        new Stem();
    }

} /* Output
Component1 constructor
Component2 constructor
Component3 constructor
Root constructor
Component3 constructor
Component2 constructor
Component1 constructor
Stem constructor
*///:~
