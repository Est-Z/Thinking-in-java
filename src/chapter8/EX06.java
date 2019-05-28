package chapter8;
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
 }

class Wind extends Instrument {
    @Override void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override public String toString() { return "Wind"; }
    @Override void adjust() { System.out.println("Adjusting Wind"); }
}   

class Percussion extends Instrument {
    @Override void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override public String toString() { return "Percussion"; }
    @Override void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    @Override void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override public String toString() { return "Stringed"; }
    @Override void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    @Override void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    @Override void play(Note n) {System.out.println("Woodwind.play() " + n); }
    @Override public String toString() { return "Woodwind"; }
}  


public class EX06 {

    public static void main(String[] args) {
        System.out.println(new Instrument());
        System.out.println(new Wind());
        System.out.println(new Percussion());
        System.out.println(new Stringed());
        System.out.println(new Brass());
        System.out.println(new Woodwind());
    }

} /* Output
Instrument
Wind
Percussion
Stringed
Wind
Woodwind
*///:~
