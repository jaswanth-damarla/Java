import java.util.*;

public class F19{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Inv_Stars(4);
        

    }

    public static void Inv_Stars(int n){
    int i,j;
    for(i=1; i<=n; i++){
        for(j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}