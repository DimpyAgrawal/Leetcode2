class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
     return path(grid, 0, 0, dp);
        
    }

    public int path(int[][] maze, int cr, int cc, int[][] dp) {
        if (cr == maze.length - 1 && cc == maze[0].length - 1)
            return maze[cr][cc];
      
        if (cr >= maze.length || cc >= maze[0].length) 
            return Integer.MAX_VALUE;

          if (dp[cr][cc] != -1)  return dp[cr][cc];
        
        int h = path(maze, cr, cc + 1, dp);
        int v = path(maze, cr + 1, cc, dp);
         return   dp[cr][cc] = Math.min(h, v) + maze[cr][cc];
        
    }
}
