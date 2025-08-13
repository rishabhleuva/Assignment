package assignment;

public class q12 extends StaticDemo {

    public static void main(String[] args) {
        System.out.println("Initial count: " + count);
        increment();
        increment();
        System.out.println("Count after increments: " + count);
    }
}
class StaticDemo {
    static int count = 0;

    static void increment() {
        count++;
    }

}
