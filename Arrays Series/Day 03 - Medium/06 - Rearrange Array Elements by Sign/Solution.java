/**
 * This class provides a method to rearrange the elements of the array such that
 * positive and negative numbers alternate.
 */

public class Solution {
    /**
     * Rearranges the elements of the array such that positive and negative numbers
     * alternate.
     *
     * @param nums The input array.
     * @return The rearranged array.
     */

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; // Initialize the result array

        int positiveIndex = 0; // Index to store positive numbers
        int negativeIndex = 1; // Index to store negative numbers

        // Traverse the input array
        for (int num : nums) {
            if (num > 0) {
                res[positiveIndex] = num; // Store positive numbers at even indices
                positiveIndex += 2; // Increment positiveIndex by 2
            } else {
                res[negativeIndex] = num; // Store negative numbers at odd indices
                negativeIndex += 2; // Increment negativeIndex by 2
            }
        }

        return res; // Return the rearranged array
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the input array.
 * This is because the method iterates through the input array once.
 *
 * Space Complexity:
 * The space complexity of this method is O(n), where n is the number of
 * elements in the input array.
 * This is because the method creates a new array of the same size as the input
 * array to store the rearranged elements.
 */
