package chapter7;

class Add{
    int add(int a) {
        return a;
    }
    int add(int a,int b) {
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
    int add(int a,int b,int c,int d) {
        return a+b+c+d;
    }
}

class Tool extends Add{
    int add(int a,int b,int c,int d,int e) {
        return a+b+c+d+e;
    }
}

public class EX13 {

    public static void main(String[] args) {
        Tool t = new Tool();
        System.out.println(t.add(1));
        System.out.println(t.add(1,2));
        System.out.println(t.add(1,2,3));
        System.out.println(t.add(1,2,3,4));
        System.out.println(t.add(1,2,3,4,5));
    }

} /* Output
1
3
6
10
15
*///:~
