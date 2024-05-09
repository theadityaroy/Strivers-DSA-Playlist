/**
 * This class provides a method to remove duplicates from a sorted array.
 */

public class Solution {
    /**
     * Removes duplicates from the sorted array while maintaining the relative order
     * of remaining elements.
     *
     * @param nums The sorted array.
     * @return The length of the modified array with duplicates removed.
     */

    public int removeDuplicates(int[] nums) {
        int res = 1; // Initialize the result length with 1 (assuming at least one unique element)

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous non-duplicate element,
            // update the array with the current element and increment the result length
            if (nums[res - 1] != nums[i]) {
                nums[res] = nums[i];
                res++;
            }
        }

        return res; // Return the length of the modified array with duplicates removed
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
