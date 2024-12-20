import java.util.*;

public class F23{
    public static void main(String args[]){
        parallelogram(5,8);
    }
    public static void parallelogram(int n, int m){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}