package assignment;

public class q8 {


    public static void main(String[] args) {
        new Person().show();
        new Person("Raj").show();
        new Person("Anu", 22).show();
    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n) {
        name = n;
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " " + age);
    }

}
