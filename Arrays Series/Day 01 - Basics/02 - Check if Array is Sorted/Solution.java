public class Solution {
    /**
     * Checks if the given array is sorted in non-decreasing order.
     *
     * @param nums The input array.
     * @return True if the array is sorted in non-decreasing order, false otherwise.
     */

    public boolean check(int[] nums) {
        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is greater than the previous element,
            // the array is not sorted in non-decreasing order
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        // If no out-of-order elements are found, return true
        return true;
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
