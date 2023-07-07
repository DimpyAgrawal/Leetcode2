class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans= image;
        int inicolor= image[sr][sc];
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        dfs(sr,sc, image, color,inicolor,delrow,delcol,ans);
        return ans;
    }
    
    public static void dfs(int row,int col, int[][] image, int color , int inicolor ,int[] delrow , int[] delcol,int[][] ans){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor                 && ans[nrow][ncol]!=color){
                dfs(nrow,ncol,image,color,inicolor,delrow,delcol,ans);
            }
        }
    }
}

