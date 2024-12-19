import java.util.*;

public class F18{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Pyr_Stars(4);
        

    }

    public static void Pyr_Stars(int n){
    int i,j;
    for(i=1; i<=n; i++){
        for(j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(j=1; j<=i; j++){
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
    }

    }
}
