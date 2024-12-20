import java.util.*;

public class F21{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Floyds_tri(5);
        

    }

    public static void Floyds_tri(int n){
    int i,j,num = 1;
    for(i=1; i<=n; i++){
        for(j=1; j<=i; j++){
            System.out.print(num);
            System.out.print(" ");
            num++;
        }
        System.out.println();
    }

    }
}
