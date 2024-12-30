import java.util.*;

public class F34 {
    public static void main(String args[]){
        String n = "Mango";
        int m = n.length();
        int count = 0;
        
        for(int i=0; i<m; i++){
            char ch = n.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
