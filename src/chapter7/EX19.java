package chapter7;

class Test19{
    private final Integer i;
    
    Test19(int i){
        this.i = i;
    }
    public int getValue() {
//        if(i == null)
//            i = new Integer(47);  ERROR  
        return i;
    }
}

public class EX19 {

    public static void main(String[] args) {
        Test19 t = new Test19(2);
        System.out.println(t.getValue());
    }

} /* Output
2
*///:~

