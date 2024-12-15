import java.util.*;

public class HW{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        double t = 100;
        double p = sc.nextDouble();

        if(p > t){
            System.out.println("You Have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
        
    }
}