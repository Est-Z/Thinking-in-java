package chapter5;

enum Money1{
    one,two,five,ten,twenty,fifth;
}
public class EX22 {

    public static void main(String[] args) {
        for(Money m : Money.values()) {
            switch(m) {
                case one:
                    System.out.println("一块钱");break;
                case two:
                    System.out.println("两块钱");break;
                case five:
                    System.out.println("五块钱");break;
                case ten:
                    System.out.println("十块钱");break;
                case twenty:
                    System.out.println("二十块钱");break;
                case fifth:
                    System.out.println("五十块钱");break;
                default:
                    break;
            }
        }
    }

}/*
一块钱
两块钱
五块钱
十块钱
二十块钱
五十块钱
*///:~
