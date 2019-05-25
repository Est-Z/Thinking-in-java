package chapter5;

class Test7{
    char a;
    short b;
    int c;
    long d;
    float e;
    double f;
    String g;
    int[] h;
    byte i;
    boolean j;
}
public class EX07 {

    public static void main(String[] args) {
        Test7 t = new Test7();;
        System.out.println("The default value of char is:"+t.a);
        System.out.println("The default value of short is:"+t.b);
        System.out.println("The default value of int is:"+t.c);
        System.out.println("The default value of long is:"+t.d);
        System.out.println("The default value of float is:"+t.e);
        System.out.println("The default value of double is:"+t.f);
        System.out.println("The default value of String is:"+t.g);
        System.out.println("The default value of array is:"+t.h);
        System.out.println("The default value of byte is:"+t.i);
        System.out.println("The default value of boolean is:"+t.j);
    }

} /*
The default value of char is:                        --'\0000'
The default value of short is:0
The default value of int is:0
The default value of long is:0
The default value of float is:0.0
The default value of double is:0.0
The default value of String is:null
The default value of array is:null
The default value of byte is:0
The default value of boolean is:false
*///:~
