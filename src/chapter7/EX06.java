package chapter7;

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}
class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }
}
public class EX06 {

    public static void main(String[] args) {
        Chess s = new Chess();
    }

} /* Output
Game constructor
BoardGame constructor
Chess constructor
*///:~
