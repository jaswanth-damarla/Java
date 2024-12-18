import java.util.*;

public class F13{
    public static void main(String arg[]){
        int a = 2;
        int b = 4;
        int c = 6;

        int av = avg(a,b,c);

        System.out.println("Average of three numbers is : " + av);

    }

    public static int avg(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;

        return avg;
    }
}