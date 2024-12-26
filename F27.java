import java.util.*;

public class F27 {
    public static void main(String args[]) {
        int n[] = {1, 2, 3, 34, 5, 6, 7, 8, 9, 10};
        int key = 6;

        int index = BinarySearch(n,key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
        System.out.println("The element found at index: " + index);
        }

       
    }
    public static int BinarySearch(int n[], int key){
        int start = 0;
        int m = n.length;
        int end = m-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(n[mid] == key){
                return mid;
            }
            if(n[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}