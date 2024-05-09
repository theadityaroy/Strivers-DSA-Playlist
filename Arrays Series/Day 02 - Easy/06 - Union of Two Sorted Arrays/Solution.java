import java.util.ArrayList;

/**
 * This class provides a method to find the union of two sorted arrays.
 */

public class Solution {
    /**
     * Finds the union of two sorted arrays.
     *
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @param n    The size of the first array.
     * @param m    The size of the second array.
     * @return An ArrayList containing the union of the two arrays.
     */

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0; // Pointer for the first array
        int j = 0; // Pointer for the second array

        // Initialize an ArrayList to store the union elements
        ArrayList<Integer> list = new ArrayList<>();

        // Merge the two arrays while ensuring no duplicates are added to the union
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                // Add arr1[i] to the union if it's not a duplicate
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                // Add arr2[j] to the union if it's not a duplicate
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1 to the union
        while (i < n) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2 to the union
        while (j < m) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list; // Return the union of the two arrays
    }
}

/*
 * Time Complexity:
 * The time complexity of this method is O(n + m), where n is the size of the
 * first array and m is the size of the second array.
 * This is because the method iterates through both arrays once.
 *
 * Space Complexity:
 * The space complexity of this method is O(n + m) in the worst case, where n is
 * the size of the first array and m is the size of the second array.
 * This is because the method stores the union elements in an ArrayList.
 */
