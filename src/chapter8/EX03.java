package chapter8;
import java.util.*;


class Shape1 {
    public void draw() {}
    public void erase() {}
    public void color() { System.out.println("Shape1 color");}
}
class Circle1 extends Shape1 {
   @Override public void draw() { System.out.println("Circle.draw()"); }
   @Override public void erase() {System.out.println("Circle.erase()"); }
   @Override public void color() { System.out.println("Circle1 color");}
}
class Square1 extends Shape1 {
  @Override public void draw() { System.out.println("Square.draw()"); }
  @Override public void erase() { System.out.println("Square.erase()"); }
  @Override public void color() { System.out.println("Square1 color");}
}

class Triangle1 extends Shape1 {
  @Override public void draw() {System.out.println("Triangle.draw()"); }
  @Override public void erase() { System.out.println("Triangle.erase()"); }
  @Override public void color() { System.out.println("Triangle1 color");}
}

class RandomShapeGenerator1{
    private Random rand = new Random(47);
    public Shape1 next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle1();
            case 1: return new Square1();
            case 2: return new Triangle1();
        }
    }
}

public class EX03 {

    private static RandomShapeGenerator1 gen = new RandomShapeGenerator1();
    public static void main(String[] args) {
        Shape1[] s = new Shape1[5];
        for(int i = 0 ; i < s.length ; i++)
            s[i] = gen.next();
        for(Shape1 shp : s) {
            shp.draw();
            shp.color();
        }
    }

} /* Output
Triangle.draw()
Shape1 color
Triangle.draw()
Shape1 color
Square.draw()
Shape1 color
Triangle.draw()
Shape1 color
Square.draw()
Shape1 color

Triangle.draw()
Shape1 color
Triangle.draw()
Shape1 color
Square.draw()
Square1 color
Triangle.draw()
Shape1 color
Square.draw()
Square1 color

Triangle.draw()
Triangle1 color
Triangle.draw()
Triangle1 color
Square.draw()
Square1 color
Triangle.draw()
Triangle1 color
Square.draw()
Square1 color
*///:~
