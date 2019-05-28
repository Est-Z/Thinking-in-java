package chapter8;

import java.util.Random;

class Instrument_1 {
    void play(Note n) { System.out.println("Instrument_1.play() " + n); }
    public String toString() { return "Instrument_1"; }
    void adjust() { System.out.println("Adjusting Instrument_1"); }
 }

class Wind_1 extends Instrument_1 {
    @Override void play(Note n) { System.out.println("Wind_1.play() " + n); }
    @Override public String toString() { return "Wind_1"; }
    @Override void adjust() { System.out.println("Adjusting Wind_1"); }
}   

class Percussion_1 extends Instrument_1 {
    @Override void play(Note n) { System.out.println("Percussion_1.play() " + n); }
    @Override public String toString() { return "Percussion_1"; }
    @Override void adjust() { System.out.println("Adjusting Percussion_1"); }
}

class Stringed_1 extends Instrument_1 {
    @Override void play(Note n) { System.out.println("Stringed_1.play() " + n); }
    @Override public String toString() { return "Stringed_1"; }
    @Override void adjust() { System.out.println("Adjusting Stringed_1"); }
}

class Brass_1 extends Wind_1 {
    @Override void play(Note n) { System.out.println("Brass_1.play() " + n); }
    @Override void adjust() { System.out.println("Adjusting Brass_1"); }
}

class Woodwind_1 extends Wind_1 {
    @Override void play(Note n) {System.out.println("Woodwind_1.play() " + n); }
    @Override public String toString() { return "Woodwind_1"; }
}  

class RandomInstrumentGenerator{
    private Random rand = new Random(47);
    public Instrument_1 next() {
        switch(rand.nextInt(6)) {
            default:
            case 0: return new Instrument_1();
            case 1: return new Wind_1();
            case 2: return new Percussion_1();
            case 4: return new Stringed_1();
            case 5: return new Brass_1();
            case 6: return new Woodwind_1();
        }
    }
}
public class EX08 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        Instrument_1[] ins = new Instrument_1[9];
        for(int i = 0 ; i < ins.length ; i++)
            ins[i] = gen.next();
        
        for(Instrument_1 i : ins) {
            i.play(Note.MIDDLE_C);
            System.out.println(i.toString());
        }

    }

} /* Output
Percussion_1.play() MIDDLE_C
Percussion_1
Brass_1.play() MIDDLE_C
Wind_1
Wind_1.play() MIDDLE_C
Wind_1
Brass_1.play() MIDDLE_C
Wind_1
Wind_1.play() MIDDLE_C
Wind_1
Brass_1.play() MIDDLE_C
Wind_1
Stringed_1.play() MIDDLE_C
Stringed_1
Percussion_1.play() MIDDLE_C
Percussion_1
*///:~
