package assignment;

class Base {
    Base(String msg) {
        System.out.println("Base constructor: " + msg);
    }

    void display() {
        System.out.println("Message from Base");
    }
}

class Derived extends Base {
    Derived(String msg) {
        super(msg);
    }

    void display() {
        super.display();
        System.out.println("Message from Derived");
    }
}

public class q20 {
    public static void main(String[] args) {
        Derived d = new Derived("Hello");
        d.display();
    }
}
