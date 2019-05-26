package chapter7;

class Cleaner1{
    private String s = "Cleaner";
    public void append(String a){ s+= a;}
    public void dilute(){ append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub(){append(" scrub()");}
    public String toString(){ return s;}
}

class DetergentDelegation{
    private Cleaner1 cleaner = new Cleaner1();
    
    public void append(String a) {
        cleaner.append(a);
    }
    public void dilute(){ cleaner.append(" dilute()");}
    public void apply() { cleaner.append(" apply()");}
    public void scrub(){ cleaner.append(" scrub()");}
    
    public String toString(){ return cleaner.toString();}
}

public class EX11 {

    public static void main(String[] args) {
        DetergentDelegation d = new DetergentDelegation();
        d.dilute();
        d.apply();
        d.scrub();
        System.out.println(d);
    }

} /* Output
Cleaner dilute() apply() scrub()
*///:~
