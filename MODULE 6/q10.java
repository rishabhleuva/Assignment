package assignment;

public class q10 {


    public static void main(String[] args) {
        MaxNumber obj = new MaxNumber();
        int max = obj.findMax(10, 25, 15);
        System.out.println("Maximum: " + max);
    }

}

class MaxNumber {
    int findMax(int a, int b, int c) {
        if (a >= b && a >= c) 
        	return a;
        else if (b >= a && b >= c) 
        	return b;
        else 
        	return c;
    }

}
