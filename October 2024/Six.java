import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Direction arrays to explore 8 directions: horizontal, vertical, and diagonal
    private static final int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int n = grid.length;    // number of rows
        int m = grid[0].length; // number of columns
        int islandCount = 0;    // to count the number of islands
        
        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is land ('1'), we found a new island
                if (grid[i][j] == '1') {
                    islandCount++;      // increment the island count
                    bfs(grid, i, j, n, m); // start BFS to mark all connected land
                }
            }
        }
        
        return islandCount;
    }
    
    // BFS function to mark all connected lands
    private void bfs(char[][] grid, int row, int col, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = '0'; // mark as visited
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currRow = current[0];
            int currCol = current[1];
            
            // Explore all 8 directions
            for (int i = 0; i < 8; i++) {
                int newRow = currRow + rowDir[i];
                int newCol = currCol + colDir[i];
                
                // If the new position is valid and is land, continue the BFS
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == '1') {
                    queue.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0'; // mark as visited
                }
            }
        }
    }
                      }
