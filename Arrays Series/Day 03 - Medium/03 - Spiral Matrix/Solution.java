import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to traverse a matrix in spiral order.
 */

public class Solution {
    /**
     * Traverses the matrix in spiral order.
     *
     * @param matrix The input matrix.
     * @return A List containing elements of the matrix traversed in spiral order.
     */

    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left if there's any
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top if there's any
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res; // Return the list containing elements traversed in spiral order
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n * m), where n is the number of rows
 * and m is the number of columns in the matrix.
 * This is because the method iterates through each element of the matrix once.
 *
 * Space Complexity:
 * The space complexity of this method is O(n * m), where n is the number of
 * rows and m is the number of columns in the matrix.
 * This is because the method uses an ArrayList to store the elements traversed
 * in spiral order.
 */
