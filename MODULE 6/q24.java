package assignment;

public class q24 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }
}
