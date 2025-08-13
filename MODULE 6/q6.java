package assignment;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(), a = 0, b = 1;
	        for(int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int c = a + b; a = b; b = c;
	}

}
}