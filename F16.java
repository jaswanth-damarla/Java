import java.util.*;

public class F16{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int s = SumofDig(num);
        System.out.println("The sum of digits of the " + num + " is " + s);
    }

    public static int SumofDig(int num){
        
        int Onum = num;
        int lastd = num % 10;
        int sum = 0;

        while(num > 0){
        lastd = num % 10;
        sum = sum + lastd;
        num = num / 10;
        }
        return sum;
    }
}