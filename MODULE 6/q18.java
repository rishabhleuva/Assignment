package assignment;
class Alpha {
    void showAlpha() {
        System.out.println("This is Alpha class");
    }
}

class Beta extends Alpha {
    void showBeta() {
        System.out.println("This is Beta class");
    }
}

public class q18 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.showAlpha();
        b.showBeta();
    }
}
