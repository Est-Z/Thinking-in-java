package chapter7;

class Simple{
    private String s;
    Simple(){
        System.out.println("Simple()");
        s = "This is simple";
    }
    public String toString() {
        return s;
    }
}

class Exercise{
    Simple simple;
    public String toString(){
        if(simple==null)    //Delayed initialization
            simple = new Simple();
        return "Simple:" + simple;
    }
}

public class EX01 {

    public static void main(String[] args) {
        Exercise e = new Exercise();
        System.out.println(e);
    }

} /* Output
Simple()
Simple:This is simple
*///:~
