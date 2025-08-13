package assignment;

import java.util.*;

public class q27 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        HashSet<Integer> unique = new HashSet<>(nums);
        System.out.println("Unique elements: " + unique);
    }
}
