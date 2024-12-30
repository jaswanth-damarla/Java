import java.util.*;

public class F35 {
    public static void main(String args[]){
        Book b1 = new Book();
        b1.author();
        b1.title();

    }
    public static class Book{
        public void author(){
            System.out.println("J.K Rowling");
        }
        public void title(){
            System.out.println("Harry potter");
        }
    }
    
}