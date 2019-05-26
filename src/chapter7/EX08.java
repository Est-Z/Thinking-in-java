package chapter7;

class Test8{
    Test8(int i){
        System.out.println("Test8 constructor");
    }
}
public class EX08 extends Test8 {
    
    EX08(){
        super(1);
        System.out.println("EX08 constructor");
    }
    EX08(int i){
        super(1);
        System.out.println("EX08 constructor");
    }
    public static void main(String[] args) {
        new EX08();
        new EX08(1);
    }

} /* Output
Test8 constructor
EX08 constructor
Test8 constructor
EX08 constructor
*///:~
