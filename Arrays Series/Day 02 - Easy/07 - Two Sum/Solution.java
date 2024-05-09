import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a method to find two numbers in an array that sum up to a
 * specific target.
 */

public class Solution {
    /**
     * Finds two numbers in the array that sum up to the target.
     *
     * @param nums   The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that sum up to the
     *         target.
     */

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; // Initialize an array to store the indices of the two numbers
        Map<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store the value-index pairs

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the complement of the current number exists in the map
            if (map.containsKey(target - nums[i])) {
                // If found, update the result array with the indices of the two numbers
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        return result; // Return the array containing the indices of the two numbers
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array once and performs
 * constant-time operations for each element.
 *
 * Space Complexity:
 * The space complexity of this method is O(n) in the worst case, where n is the
 * number of elements in the array.
 * This is because the method creates a HashMap to store value-index pairs.
 */
