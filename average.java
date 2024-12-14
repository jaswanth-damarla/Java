1. import  java.util.*;

public class HW{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float sum = a + b + c;
        float avg = sum/3;

        System.out.println(avg);
    }
}
