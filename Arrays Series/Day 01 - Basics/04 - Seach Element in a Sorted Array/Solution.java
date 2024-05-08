public class Solution {
    /**
     * Searches for an element in a sorted array using binary search.
     *
     * @param arr The sorted array of integers.
     * @param N   The size of the array.
     * @param K   The element to search for.
     * @return The index of the element if found, otherwise -1.
     */

    static int searchInSorted(int arr[], int N, int K) {
        int low = 0;
        int high = N - 1;

        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If element is found at mid
            if (arr[mid] == K) {
                return mid;
            }
            // If element is present in left subarray
            else if (arr[mid] > K) {
                high = mid - 1;
            }
            // If element is present in right subarray
            else {
                low = mid + 1;
            }
        }

        // If element is not present in array
        return -1;
    }
}

/*
 * Time Complexity:
 * The time complexity of binary search is O(log n), where n is the number of
 * elements in the array.
 * This is because in each step, the search space is halved.
 *
 * Space Complexity:
 * The space complexity of binary search is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
