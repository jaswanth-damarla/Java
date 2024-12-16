import java.util.*;

public class F8{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print table of it: ");
        int n = sc.nextInt();

        int i;
        for(i=1; i<=10; i++){
            int m = n * i;

            System.out.println(n + "x" + i + "=" + m);

        }
    }
}