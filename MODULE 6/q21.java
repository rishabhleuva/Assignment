package assignment;

abstract class ShapeX {
    abstract void draw();
    void info() {
        System.out.println("abc");
    }
}

class abc extends ShapeX {
    void draw() {
        System.out.println("xyz");
    }
}

public class q21 {
    public static void main(String[] args) {
        abc h = new abc();
        h.info();
        h.draw();
    }
}
