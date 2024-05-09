public class Solution {
    /**
     * Moves all zeroes to the end of the array while maintaining the relative order
     * of other elements.
     *
     * @param nums The input array.
     */

    public void moveZeroes(int[] nums) {
        int idx = 0; // Initialize the index to track the position to place non-zero elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, swap it with the element at index 'idx'
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++; // Increment 'idx' to move to the next position for non-zero elements
            }
        }
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
