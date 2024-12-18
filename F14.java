import java.util.*;

public class F14{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int re = revnum(num);
        if(re == 1){
            System.out.println("The number " + num + " is a palindrome");
        }else{
            System.out.println("The number " + num + " is not a palindrome");
        }

    }

    public static int revnum(int num){
        
        int Onum = num;
        int lastd = num % 10;
        int revn = 0;

        while(num > 0){
        revn = revn * 10 + lastd;
        num = num / 10;
        lastd = num % 10;
        }

        if(revn == Onum){
            return 1;
        }else{
            return 0; 
        }
    }
}