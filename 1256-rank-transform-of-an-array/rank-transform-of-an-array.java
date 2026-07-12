import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        // Copy original array
        int[] sorted = arr.clone();

        // Sort the copied array
        Arrays.sort(sorted);

        // Store number -> rank
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // Assign ranks to unique elements
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        // Replace original values with ranks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}