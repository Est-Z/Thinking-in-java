package chapter5;

class Dog5{
    public void bark(int i) {
        System.out.println("Ğ¡È®¹··Í£¡");
    }
    public void bark(double i) {
        System.out.println("¶ñ¹·ÅØÏø£¡");
    }
}
public class EX05 {

    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.bark(1);
        dog.bark(1.1);
    }

} /*
Ğ¡È®¹··Í£¡
¶ñ¹·ÅØÏø£¡
*///:~
