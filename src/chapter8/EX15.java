package chapter8;


class Glyph {
    void draw() {  System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}   

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
      radius = r;
      System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
      System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}   

class RectangularGlyph extends Glyph{
    private int weight,height;
    RectangularGlyph(int weight,int height){
        this.height = height;
        this.weight = weight;
        System.out.println("RectangularGlyph.weight = " + weight);
        System.out.println("RectangularGlyph.height = " + height);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), weight*height = " + weight*height);
      }
}

public class EX15 {
    public static void main(String[] args) {
      new RectangularGlyph(5,10);
    }
} /* Output
Glyph() before draw()
RectangularGlyph.draw(), weight*height = 0
Glyph() after draw()
RectangularGlyph.weight = 5
RectangularGlyph.height = 10
*///:~
