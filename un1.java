import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = findFlowerIndexes(n, t, arr);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findFlowerIndexes(int n, int t, int[] arr) {
        // User will implement this function
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == t){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{0, 0};
    }
}