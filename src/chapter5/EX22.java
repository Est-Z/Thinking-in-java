package chapter5;

enum Money1{
    one,two,five,ten,twenty,fifth;
}
public class EX22 {

    public static void main(String[] args) {
        for(Money m : Money.values()) {
            switch(m) {
                case one:
                    System.out.println("һ��Ǯ");break;
                case two:
                    System.out.println("����Ǯ");break;
                case five:
                    System.out.println("���Ǯ");break;
                case ten:
                    System.out.println("ʮ��Ǯ");break;
                case twenty:
                    System.out.println("��ʮ��Ǯ");break;
                case fifth:
                    System.out.println("��ʮ��Ǯ");break;
                default:
                    break;
            }
        }
    }

}/*
һ��Ǯ
����Ǯ
���Ǯ
ʮ��Ǯ
��ʮ��Ǯ
��ʮ��Ǯ
*///:~
