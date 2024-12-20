import java.util.*;

public class F20{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Inv_Halfpyr_num(6);
        

    }

    public static void Inv_Halfpyr_num(int n){
    int i,j,num = 1;
    for(i=1; i<=n; i++){
        for(j=1; j<=n-i; j++){
            System.out.print(num);
            num++;
        }
        System.out.println();
        num = 1;
    }

    }
}