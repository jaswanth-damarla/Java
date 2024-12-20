import java.util.*;

public class F24{
    public static void main(String args[]){
        int n[] = {1,2,3,34,5,6,7,8,9,10};
        int key = 2;
        int index = LinearSearch(n,key);
        if(index == -1){
            System.out.println("Element was not found");
        }else{
            System.out.println("Element was found at index: " + index);
        }
    }
    public static int LinearSearch(int n[], int key){

        int i;
        for(i=0; i<n.length; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    
    }

}
