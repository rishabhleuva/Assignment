package assignment;

public class q14 {

	public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.powerOn();
        sp.call();
        sp.browse();
    }

}
class Device {
    void powerOn() {
        System.out.println("Device powered on");
    }
}

class Phone extends Device {
    void call() {
        System.out.println("Phone making a call");
    }
}

class SmartPhone extends Phone {
    void browse() {
        System.out.println("SmartPhone browsing internet");
    }
}

