public class Solution {
    /**
     * Finds the second largest element in the given array.
     *
     * @param arr The input array.
     * @return The second largest element in the array.
     */

    public int getSecondLargest(int[] arr) {
        // Initialize two variables to keep track of the first and second largest
        // elements
        int max1 = Integer.MIN_VALUE; // Initialize max1 to the smallest possible integer value
        int max2 = max1; // Initialize max2 to the same value as max1

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is greater than max1,
            // update both max1 and max2 accordingly
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            // If the current element is not greater than max1 but is greater than max2,
            // update max2
            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        // Return the second largest element found
        return max2;
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
