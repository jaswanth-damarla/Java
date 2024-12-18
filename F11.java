import java.util.Scanner;

public class F11{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt(); // Initialize `n` using user input

        int f = fact(n); // Call the `fact` method and store the result in `f`

        System.out.println("The factorial of " + n + " is: " + f);
    }

    public static int fact(int n) {
        int i, f = 1;

        for (i = 1; i <= n; i++) {
            f = f * i; // Calculate factorial
        }

        return f; // Return the result
    }
}
