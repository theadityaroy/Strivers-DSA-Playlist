/**
 * This class provides a method to find the single number in an array where
 * every element appears twice except for one.
 */

public class Solution {
    /**
     * Finds the single number in the array where every element appears twice except
     * for one.
     *
     * @param nums The array where every element appears twice except for one.
     * @return The single number.
     */

    public int singleNumber(int[] nums) {
        // Initialize the result with the first element of the array
        int xor = nums[0];

        // Iterate through the array and perform XOR operation with each element
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }

        // The final value of 'xor' will be the single number
        return xor;
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array once to perform the XOR
 * operation.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
