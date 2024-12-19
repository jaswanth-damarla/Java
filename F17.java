import java.util.*;

public class F17{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        HRec(4,10);
        

    }

    public static void HRec(int totR, int totC){
        for(int i=1; i<=totR; i++){
            for(int j=1; j<=totC; j++){
                if(i == 1 || i == totR || j == 1 || j == totC){
                    System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}

