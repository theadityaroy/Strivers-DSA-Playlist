public class Solution {
    /**
     * Finds the maximum number of consecutive 1s in a binary array.
     *
     * @param nums The binary array.
     * @return The maximum number of consecutive 1s.
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // Initialize the maximum count of consecutive 1s
        int count = 0; // Initialize the count of consecutive 1s

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is 1, increment the count
            if (nums[i] == 1) {
                count++;
            }
            // If the current element is 0, update the maximum count and reset the count
            else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }

        // Update the maximum count with the final count (in case the array ends with
        // consecutive 1s)
        maxCount = Math.max(count, maxCount);

        // Return the maximum count of consecutive 1s
        return maxCount;
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array once.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
