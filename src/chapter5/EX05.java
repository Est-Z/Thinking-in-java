package chapter5;

class Dog5{
    public void bark(int i) {
        System.out.println("СȮ���ͣ�");
    }
    public void bark(double i) {
        System.out.println("��������");
    }
}
public class EX05 {

    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.bark(1);
        dog.bark(1.1);
    }

} /*
СȮ���ͣ�
��������
*///:~
