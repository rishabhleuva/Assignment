package assignment;

class Task {
    void execute() {
        System.out.println("Executing a general task");
    }
}

class SpecialTask extends Task {
    void execute() {
        System.out.println("Executing a special task");
    }
}

public class q19 {
    public static void main(String[] args) {
        Task t = new SpecialTask();
        t.execute();
    }
}
