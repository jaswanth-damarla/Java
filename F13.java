import java.util.*;

public class F13{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println(isEven(a));

    }

    public static boolean isEven(int a){
        if (a % 2 == 0) {
            return true; // Return true if the number is even
        } else {
            return false; // Return false if the number is odd
        }
    }
}
