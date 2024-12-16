import java.util.*;

public class F6{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice;


        do {

             System.out.println("Enter the set of numbers: ");

        int n = sc.nextInt();

            if(n % 2 == 0){
                evenSum += n;
            }
            else{
                oddSum += n;
            }

            System.out.println("Do you wish to continue? if 'yes' press 1 or 'no' press 0");

            choice = sc.nextInt();
    
        } while (choice == 1);


        System.out.println("Even numbers Sum is: " + evenSum);
        System.out.println("Odd numbers Sum is: " + oddSum);

    
    }
}
