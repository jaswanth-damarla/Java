import java.util.*;

public class F26 {
    public static void main(String args[]) {
        int n[] = {1, 2, 3, 34, 5, 6, 7, 8, 9, 10};

        int[] result = findLargestAndSmallest(n);

        System.out.println("The largest element is: " + result[0]);
        System.out.println("The smallest element is: " + result[1]);
    }

    public static int[] findLargestAndSmallest(int n[]) {
        int largest = Integer.MIN_VALUE;  // Set largest to the smallest possible value
        int smallest = Integer.MAX_VALUE; // Set smallest to the largest possible value

        for (int i = 0; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
            if (n[i] < smallest) {
                smallest = n[i];
            }
        }

        return new int[]{largest, smallest}; // Return both values in an array
    }
}