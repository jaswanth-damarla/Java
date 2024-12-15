import java.util.*;

public class HW{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println(n + " " +  "is Positive");
        }
        else{
            System.out.println(n + " " +  " is Negative");
        }
    }
}