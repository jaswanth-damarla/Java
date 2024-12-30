import java.util.*;

public class F31 {
    public static void main(String args[]) {

        int prices[] = {7, 1, 5, 3, 6, 4};
        int n = prices.length; // Semicolon added
        int temp; // Declare temp variable

        for (int i = 0; i < n; i++) { // Outer loop
            for (int j = 0; j < n - 1; j++) { // Inner loop for comparison
                if (prices[j] > prices[j + 1]) { // Compare adjacent elements
                    // Swap elements
                    temp = prices[j + 1];
                    prices[j + 1] = prices[j];
                    prices[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(prices));
    }
}
