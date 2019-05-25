package chapter5;

class Test9{
    int i;
    String s;
    
    
    Test9(int i){
        this.i = i;
    }
    Test9(int i , String s){
        this(i);
        this.s = s;
    }
}

public class EX09 {

    public static void main(String[] args) {
        Test9 t = new Test9(3,"three");
        System.out.println(t.i + " " + t.s);
    }

} /*
3 three
*///:~
