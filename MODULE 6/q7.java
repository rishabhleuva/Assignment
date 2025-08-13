package assignment;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Student s = new Student("Amit", 21);
	        s.display();

	}

}

class Student {
    String name; 
    int age;
    Student(String n, int a){ 
    	name = n; age = a;
    	}
    void display() { 
    	System.out.println(name + " " + age);
    	}
 
}
