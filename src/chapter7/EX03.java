package chapter7;

class Art{
    Art(){
        System.out.println("Art construcor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing construcor");
    }
}

class Cartoon extends Drawing{
    
}

public class EX03 {

    public static void main(String[] args) {
        new Cartoon();
    }

} /* Output
Art construcor
Drawing construcor
*///:~
