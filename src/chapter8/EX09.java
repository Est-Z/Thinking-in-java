package chapter8;

class Rodent{
    void speak() { System.out.println("我会唱！");}
}

class Mouse extends Rodent{
    @Override void speak() { System.out.println("我会跳！");}
}
class Gerbil extends Rodent{
    @Override void speak() { System.out.println("我会rup！");}
}
class Hamster extends Rodent{
    @Override void speak() { System.out.println("我会篮球！");}
}

public class EX09 {

    public static void main(String[] args) {
        Rodent[] r = {
                new Rodent(),
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        
        for(Rodent rodent : r)
            rodent.speak();
    }

} /* Output
我会唱！
我会跳！
我会rup！
我会篮球！
*///:~
