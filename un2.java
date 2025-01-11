import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char first = s.charAt(0);
        char second = s.charAt(1);
        if((first + second)%2 == 0){
            System.out.println("Black");
        }else{
            System.out.println("White");
        }
    }
}