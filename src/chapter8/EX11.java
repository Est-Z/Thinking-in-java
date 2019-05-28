package chapter8;

class Pickle{
    Pickle(){ System.out.println("Pickle()"); }
}
class Meal{
    Meal(){ System.out.println("Meal()"); }
}

class Bread{
    Bread(){ System.out.println("Bread()"); }
}

class Cheese{
    Cheese(){ System.out.println("Cheese()"); }
}

class Lettuce{
    Lettuce(){ System.out.println("Lettuce()"); }
}

class Lunch extends Meal{
    Lunch(){ System.out.println("Lunch()"); }}

class PortableLunch extends Lunch{
    PortableLunch(){ System.out.println("PortableLunch()");}
}

class Sandwich extends PortableLunch {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();
    public Sandwich() { System.out.println("Sandwich()"); }
}

public class EX11 {

    public static void main(String[] args) {
        new Sandwich();
    }

} /* Output
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Pickle()
Sandwich()
*///:~
