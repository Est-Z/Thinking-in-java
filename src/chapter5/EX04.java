package chapter5;

class Test4{
    Test4(){
        System.out.println("This is default constructor!");
    }
    Test4(String s){
        System.out.println("This isn't default constructor! " + s);
    }
}
public class EX04 {
    
    public static void main(String[] args) {
        new Test4();
        new Test4("You look!");
    }

} /*
This is default constructor!
This isn't default constructor! You look!
*///:~