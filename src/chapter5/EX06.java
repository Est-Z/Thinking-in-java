package chapter5;

class Dog6{
    public void bark(int i,double j) {
        System.out.println("СȮ���ͣ�");
    }
    public void bark(double j,int i) {
        System.out.println("��������");
    }
}
public class EX06 {

    public static void main(String[] args) {
        Dog6 dog = new Dog6();
        dog.bark(1,3.14);
        dog.bark(3.14,1);
    }

} /*
СȮ���ͣ�
��������
*///:~
