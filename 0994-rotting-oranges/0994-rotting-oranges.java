class Solution {
    public int orangesRotting(int[][] grid) {
        int min = 2;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    dfs(grid, i, j, 2);
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return -1;
                }min = Math.max(min, grid[i][j]);
           //     System.out.println(min+" "+grid[i][j]);
            }
        }
        return min-2;
    
}
    
    
    private void dfs(int [][]arr, int i, int j, int n){
        if(i<0 || i>=arr.length ||j<0 || j>= arr[0].length|| arr[i][j]==0|| 
        (arr[i][j]>1 && arr[i][j]<n ))            //empty shell
            return;                         

            arr[i][j]=n;
            dfs(arr, i+1, j, n+1);
            dfs(arr, i-1, j, n+1);
            dfs(arr, i, j-1, n+1);
            dfs(arr, i, j+1, n+1);

    }
}