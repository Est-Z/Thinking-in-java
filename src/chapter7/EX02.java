package chapter7;

class Cleaner{
    private String s = "Cleaner";
    public void append(String a){ s+= a;}
    public void dilute(){ append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub(){append(" scrub()");}
    public String toString(){ return s;}
}
class Detergent extends Cleaner{
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){ append(" foam()");}
}
class Water extends Detergent{
    public void scrub() {
        append(" Water.scrub()");
        super.scrub();
    }
    public void sterilize(){ append(" sterilize()");}
}

public class EX02 {

    public static void main(String[] args) {
        Water x = new Water();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
    }

} /* Output
Cleaner dilute() apply() Water.scrub() Detergent.scrub() scrub() foam() sterilize()
*///:~
