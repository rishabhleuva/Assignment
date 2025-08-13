package assignment;

public class q9 {


    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ravi");
        e.setSalary(50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
class Employee {
    private String name;
    private int salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }

}
