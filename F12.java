public class F12{
    public static void main(String arg[]) {
        int n = 5; // Number of items
        int r = 2; // Items to choose

        // Calculate factorials
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        // Calculate binomial coefficient
        int bincoeff = fact_n / (fact_r * fact_nmr);

        // Print result
        System.out.println("The binomial coefficient (C(" + n + ", " + r + ")) is: " + bincoeff);
    }

    public static int fact(int n) {
        int f = 1;

        // Fix the loop to start from 1
        for (int i = 1; i <= n; i++) {
            f = f * i; // Multiply to calculate factorial
        }

        return f;
    }
}