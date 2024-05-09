/**
 * This class provides a method to find the missing number in an array of
 * consecutive numbers from 0 to n.
 */

public class Solution {
    /**
     * Finds the missing number in the array of consecutive numbers from 0 to n.
     *
     * @param nums The array containing consecutive numbers from 0 to n with one
     *             number missing.
     * @return The missing number.
     */

    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Calculate the sum of all numbers from 0 to n using the formula (n * (n + 1))
        // / 2
        int totalSum = (n * (n + 1)) / 2;

        // Subtract each element in the array from the total sum
        for (int i : nums) {
            totalSum -= i;
        }

        // The remaining value of totalSum will be the missing number
        return totalSum;
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array once to calculate the
 * total sum and then once more to subtract each element.
 *
 * Space Complexity:
 * The space complexity of this method is O(1).
 * Only a constant amount of extra space is used regardless of the size of the
 * input array.
 */
