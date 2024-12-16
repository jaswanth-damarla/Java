public class F10{
    public static void main(String arg[]){

      char ch = 'A';
      int n = 5;
      int i;
      int j;

      for(i=1; i<=n; i++){
        for(j=1; j<=i; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
      }

    }
}