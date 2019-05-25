package chapter5;

enum Money{
    one,two,five,ten,twenty,fifth;
}
public class EX21 {

    public static void main(String[] args) {
        for(Money m : Money.values())
            System.out.println(m + ",ordinal:" + m.ordinal());
    }

} /*
one,ordinal:0
two,ordinal:1
five,ordinal:2
ten,ordinal:3
twenty,ordinal:4
fifth,ordinal:5
*///:~
