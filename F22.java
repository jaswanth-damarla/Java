import java.util.*;

public class F22{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        zero_one_tri(4);
        

    }

    public static void zero_one_tri(int n){
    int i,j,num = 1;
    for(i=1; i<=n; i++){
        for(j=1; j<=i; j++){
            int sum = i + j;
            if(sum % 2 == 0){
            System.out.print("1");
            }else{
            System.out.print("0");
            }
        }
        System.out.println();
    }

    }
}