package chapter5;

class Dog6{
    public void bark(int i,double j) {
        System.out.println("Ğ¡È®¹··Í£¡");
    }
    public void bark(double j,int i) {
        System.out.println("¶ñ¹·ÅØÏø£¡");
    }
}
public class EX06 {

    public static void main(String[] args) {
        Dog6 dog = new Dog6();
        dog.bark(1,3.14);
        dog.bark(3.14,1);
    }

} /*
Ğ¡È®¹··Í£¡
¶ñ¹·ÅØÏø£¡
*///:~
