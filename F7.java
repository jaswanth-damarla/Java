import java.util.*;

public class F7{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int fact = 1;

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i;
        for(i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial is: " + fact);
    }
}