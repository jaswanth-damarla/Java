import java.util.*;


public class F29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean r = redundantElem(num);
        if(redundantElem(num)){
            System.out.println("True, There is a redundant element");
        }else{
            System.out.println("False, There is no redundant element");
        }
        
    }

    public static boolean redundantElem(int num[]){
        int i;
        int j;
        int n = num.length;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
