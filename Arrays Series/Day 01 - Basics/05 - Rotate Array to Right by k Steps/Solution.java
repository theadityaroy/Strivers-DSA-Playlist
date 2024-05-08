public class Solution {
    /**
     * Rotates an array to the right by k steps.
     *
     * @param nums The array to rotate.
     * @param k    The number of steps to rotate by.
     */

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;

        // Adjust k to handle cases where k is larger than the array size
        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements after rotating
        reverse(nums, k, n - 1);
    }

    /**
     * Reverses the elements in the specified range of the array.
     *
     * @param nums The array to reverse.
     * @param low  The starting index of the range to reverse.
     * @param high The ending index of the range to reverse.
     */

    public void reverse(int[] nums, int low, int high) {
        while (low < high) {
            // Swap elements at low and high indices
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            // Move low index forward and high index backward
            low++;
            high--;
        }
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array three times, each time
 * reversing a portion of the array.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
