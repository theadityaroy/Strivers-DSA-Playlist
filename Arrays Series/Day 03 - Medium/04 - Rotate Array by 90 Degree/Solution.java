/**
 * This class provides a method to rotate a square matrix by 90 degrees
 * clockwise.
 */

public class Solution {
    /**
     * Rotates the given square matrix by 90 degrees clockwise.
     *
     * @param matrix The input square matrix to rotate.
     */

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n^2), where n is the number of rows
 * (or columns) in the matrix.
 * This is because the method performs two operations:
 * 1. Transposing the matrix, which requires iterating through each element of
 * the matrix once.
 * 2. Reversing each row, which also requires iterating through each element of
 * the matrix once.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input matrix.
 */
