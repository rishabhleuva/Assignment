package assignment;

public class q11 {

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5.5, 2.3));
        System.out.println(obj.add("Hello ", "World"));
    }

}
class OverloadExample {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

}
