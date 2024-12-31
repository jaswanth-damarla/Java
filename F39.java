import java.util.*;

public class F39{
  public static void main(String args[]){
    ArrayList<Integer>nums = new ArrayList<>();

    nums.add(1);
    nums.add(2);
    nums.add(2);
    nums.add(3);

    System.out.println(Monotonic(nums));
  }

  public static boolean Monotonic (ArrayList<Integer> nums) {
    boolean inc = true;  // Assume the list is monotonically increasing
    boolean dec = true;  // Assume the list is monotonically decreasing
    
    // Iterate through the ArrayList from the 0th index to the second-last index
    for (int i = 0; i < nums.size() - 1; i++) {
        // If the current element is greater than the next, it cannot be increasing
        if (nums.get(i) > nums.get(i + 1))
            inc = false;

        // If the current element is less than the next, it cannot be decreasing
        if (nums.get(i) < nums.get(i + 1))
            dec = false;
    }
    
    // The list is monotonic if it is either entirely increasing or entirely decreasing
    return inc || dec;
}
}
