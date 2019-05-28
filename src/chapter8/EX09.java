package chapter8;

class Rodent{
    void speak() { System.out.println("�һᳪ��");}
}

class Mouse extends Rodent{
    @Override void speak() { System.out.println("�һ�����");}
}
class Gerbil extends Rodent{
    @Override void speak() { System.out.println("�һ�rup��");}
}
class Hamster extends Rodent{
    @Override void speak() { System.out.println("�һ�����");}
}

public class EX09 {

    public static void main(String[] args) {
        Rodent[] r = {
                new Rodent(),
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        
        for(Rodent rodent : r)
            rodent.speak();
    }

} /* Output
�һᳪ��
�һ�����
�һ�rup��
�һ�����
*///:~
