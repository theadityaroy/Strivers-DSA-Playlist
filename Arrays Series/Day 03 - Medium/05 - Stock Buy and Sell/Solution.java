/**
 * This class provides a method to calculate the maximum profit that can be
 * obtained from buying and selling stocks.
 */

public class Solution {
    /**
     * Calculates the maximum profit that can be obtained from buying and selling
     * stocks.
     *
     * @param prices The array of stock prices.
     * @return The maximum profit.
     */

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0]; // Initialize the minimum price to the first element
        int maxProfit = 0; // Initialize the maximum profit to 0

        // Iterate through the prices array
        for (int i = 1; i < n; i++) {
            int currentProfit = prices[i] - minPrice; // Calculate the profit for the current day
            maxProfit = Math.max(maxProfit, currentProfit); // Update the maximum profit if needed
            minPrice = Math.min(minPrice, prices[i]); // Update the minimum price encountered so far
        }

        return maxProfit; // Return the maximum profit
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the prices array.
 * This is because the method iterates through the prices array once.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
