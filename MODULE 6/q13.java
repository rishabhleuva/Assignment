package assignment;

public class q13 {

	public static void main(String[] args) {
        Hammer h = new Hammer();
        h.use();
        h.hit();
    }

}
class Tool {
    void use() {
        System.out.println("Using a tool");
    }
}

class Hammer extends Tool {
    void hit() {
        System.out.println("Hammer hits the nail");
    }
}

