/**
 * This class provides a method to search for a target value in a matrix.
 */

public class Solution {
    /**
     * Searches for a target value in the matrix.
     *
     * @param matrix The 2D matrix.
     * @param target The target value to search for.
     * @return True if the target value is found, false otherwise.
     */

    public boolean searchMatrix(int[][] matrix, int target) {
        // Iterate through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Check if the target value exists in the current row
            if (isTarget(matrix[i], target)) {
                return true; // Return true if found
            }
        }

        return false; // Return false if not found in any row
    }

    /**
     * Searches for a target value in a sorted array.
     *
     * @param arr    The sorted array.
     * @param target The target value to search for.
     * @return True if the target value is found, false otherwise.
     */

    public boolean isTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Perform binary search on the sorted array
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true; // Return true if target value is found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // Return false if target value is not found
    }
}

/*
 * Time Complexity:
 * - For the searchMatrix method: O(m * log n), where m is the number of rows
 * and n is the number of columns in the matrix.
 * This is because the method iterates through each row and performs binary
 * search on each row (which has length n).
 * - For the isTarget method: O(log n), where n is the number of elements in the
 * array.
 * This is because the method performs binary search on the sorted array.
 *
 * Space Complexity:
 * The space complexity of both methods is O(1).
 * Only a constant amount of extra space is used regardless of the input size.
 */
