import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Initialize pointers and result array
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;                // Pointer for smallest elements
        int right = arr.length - 1;  // Pointer for largest elements
        
        // Step 3: Populate result array by alternating between max and min elements
        while (left <= right) {
            if (right >= left) {
                result.add(arr[right--]); // Add the maximum element
            }
            if (left <= right) {
                result.add(arr[left++]);  // Add the minimum element
            }
        }
        
        return result;
    }
}
