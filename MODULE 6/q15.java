package assignment;

public class q15 {

    public static void main(String[] args) {
        Game g = new Chess();
        g.play();
    }

}
class Game {
    void play() {
        System.out.println("Playing a game");
    }
}

class Chess extends Game {
    void play() {
        System.out.println("Playing chess with a friend");
    }
}

