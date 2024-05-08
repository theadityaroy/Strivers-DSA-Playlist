public class Solution {
    /**
     * Finds the largest element in the given array.
     *
     * @param arr The input array.
     * @return The largest element in the array.
     */

    public static int getLargest(int[] arr) {
        // Initialize the largest element as the first element of the array
        int largest = arr[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is larger than the current largest element,
            // update the largest element
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Return the largest element found
        return largest;
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
