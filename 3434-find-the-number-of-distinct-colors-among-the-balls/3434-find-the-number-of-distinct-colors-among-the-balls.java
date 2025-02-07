import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColor = new HashMap<>(); // Stores ball -> color
        Map<Integer, Integer> colorCount = new HashMap<>(); // Stores color -> count
        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0]; 
            int color = queries[i][1]; 

            // If the ball was previously colored, reduce count of the old color
            if (ballColor.containsKey(ball)) {
                int oldColor = ballColor.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);

                // If the old color is no longer assigned to any ball, remove it
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            // Assign new color to the ball
            ballColor.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            // Store the number of distinct colors
            res[i] = colorCount.size();
        }

        return res;
    }
}
