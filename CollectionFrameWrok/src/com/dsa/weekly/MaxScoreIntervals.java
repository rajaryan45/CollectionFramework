package com.dsa.weekly;

import java.util.Arrays;

public class MaxScoreIntervals {

    // Function to check if it's possible to choose numbers with at least `mid` difference
    public static boolean canChooseWithMinDifference(int[] start, int d, int mid) {
        int chosen = start[0];
        for (int i = 1; i < start.length; i++) {
            int nextChosen = chosen + mid;

            if (nextChosen > start[i] + d) {
                return false; // Not feasible for this mid
            }
            chosen = Math.max(start[i], nextChosen);
        }
        return true;
    }

    // Function to find the maximum score (maximum possible minimum difference)
    public static int maxScore(int[] start, int d) {
        // Sort the intervals to ensure proper ordering
        Arrays.sort(start);
        
       
        int low = 0;
        int high = start[start.length - 1] + d - start[0];  
        while (low <= high) {
            int mid = (low + high) / 2;

            
            if (canChooseWithMinDifference(start, d, mid)) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

       
        return high;
    }

    public static void main(String[] args) {
        // Example: start = [6, 0, 3], d = 2
        int[] start = {6, 0, 3};
        int d = 2;

        // Output the maximum possible score
        int result = maxScore(start, d);
        System.out.println("Maximum score: " + result);  // Output should be 4
    }
}
