import java.util.*;

public class F28 {
    public static void main(String args[]) {
        int n[] = {1, 2, 3, 34, 5, 6, 7, 8, 9, 10};

        int r[] = Reversed(n);
        System.out.println("The reversed array is: " + Arrays.toString(r));
       
    }
    public static int[] Reversed(int n[]){
        int start = 0;
        int end = n.length - 1;
        int temp;

        while(start < end){
            temp = n[end];
            n[end] = n[start];
            n[start] = temp;

            start++;
            end--;
        }
        return n;
    }
}