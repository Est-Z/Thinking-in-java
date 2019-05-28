package chapter8;

class Rodent1{
    Rodent1() { System.out.println("Rodent1");}
}

class Mouse1{
    Mouse1(){ System.out.println("Mouse1");}
}
class Gerbil1 extends Rodent1{
    Mouse1 m = new Mouse1();
    Gerbil1(){ System.out.println("Gerbil1");}
}
class Hamster1 extends Rodent1{
    Gerbil1 g = new Gerbil1();
    Hamster1(){ System.out.println("Hamster1");}
}


public class EX12 {

    public static void main(String[] args) {
        new Hamster1();
    }

} /* Output
Rodent1
Rodent1
Mouse1
Gerbil1
Hamster1
*///:~
