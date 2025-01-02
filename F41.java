import java.util.*;

public class F41 {
    public static void main(String args[]) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int n = arr.length;
        boolean found = false; // Flag to check if a pair is found

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int a = arr[i];
                    int b = arr[j];
                    System.out.println("{" + a + "," + b + "}");
                    found = true; // Set flag to true
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}