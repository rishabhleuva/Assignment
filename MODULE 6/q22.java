package assignment;

interface Payment {
    void process(double amount);
}

class UPIPayment implements Payment {
    public void process(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class q22 {
    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.process(500.75);
    }
}
