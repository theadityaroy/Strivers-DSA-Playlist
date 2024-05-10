import java.util.ArrayList;
import java.util.Collections;

/**
 * This class provides a method to find leaders in an array.
 */

public class Solution {
    /**
     * Finds leaders in the given array.
     *
     * @param arr The input array.
     * @param n   The size of the array.
     * @return An ArrayList containing the leaders in the array.
     */

    static ArrayList<Integer> findLeaders(int[] arr, int n) {
        ArrayList<Integer> leadersList = new ArrayList<>();
        int leader = arr[n - 1]; // Initialize the last element as the leader
        leadersList.add(leader); // Add the leader to the list

        // Traverse the array from right to left to find leaders
        for (int i = n - 2; i >= 0; i--) {
            // If the current element is greater than or equal to the leader, it becomes the
            // new leader
            if (arr[i] >= leader) {
                leadersList.add(arr[i]); // Add the leader to the list
                leader = arr[i]; // Update the leader
            }
        }

        Collections.reverse(leadersList); // Reverse the list to maintain the original order
        return leadersList; // Return the list of leaders
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n), where n is the number of elements
 * in the array.
 * This is because the method iterates through the array once from right to
 * left.
 *
 * Space Complexity:
 * The space complexity of this method is O(n), where n is the number of
 * elements in the array.
 * This is because the method uses an ArrayList to store the leaders.
 */
