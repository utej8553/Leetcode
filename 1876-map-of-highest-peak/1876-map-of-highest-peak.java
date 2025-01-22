import java.util.*;

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] temp = new int[rows][cols];
        
        // Initialize all cells as -1 (unvisited)
        for (int i = 0; i < rows; i++) {
            Arrays.fill(temp[i], -1);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        
        // Add all water cells to the queue and set their height to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isWater[i][j] == 1) {
                    temp[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        // Directions for up, down, left, right
        int[] directions = {-1, 0, 1, 0, 0, -1, 0, 1};
        
        // Perform BFS to fill the heights
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            
            // Explore all 4 directions
            for (int i = 0; i < 4; i++) {
                int nx = x + directions[i * 2];
                int ny = y + directions[i * 2 + 1];
                
                // If the neighbor is within bounds and hasn't been visited
                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && temp[nx][ny] == -1) {
                    temp[nx][ny] = temp[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        return temp;
    }
}
