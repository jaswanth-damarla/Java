import java.util.*;

public class F30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int prices[] = {7, 1, 5, 3, 6, 4};

        int mp = Profit_Losses(prices);

        System.out.println("The maximum profit is: " + mp);
    }

    public static int Profit_Losses(int prices[]) {
        int n = prices.length;

        // Edge case: If there are less than 2 prices, no profit can be made
        if (n < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Start with a very high buying price
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if selling on day i and update maxProfit
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}

