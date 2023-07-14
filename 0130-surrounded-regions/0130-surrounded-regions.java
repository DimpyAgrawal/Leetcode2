class Solution {
    public void solve(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        
        int[][] vis=new int[n][m];
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        
        //check for first and last row
        
        for(int j=0;j<m;j++){
            if(mat[0][j]=='O' && vis[0][j]==0)
                dfs(0,j,mat,vis,delrow,delcol);
            if(mat[n-1][j]=='O' && vis[n-1][j]==0)
                 dfs(n-1,j,mat,vis,delrow,delcol);
        }
        
        //check for first and last column
        
        for(int i=0;i<n;i++){
            if(mat[i][0]=='O' && vis[i][0]==0)
                 dfs(i,0,mat,vis,delrow,delcol);
            if(mat[i][m-1]=='O' && vis[i][m-1]==0)
                 dfs(i,m-1,mat,vis,delrow,delcol);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='O' && vis[i][j]==0){
                    mat[i][j]='X';
                }
            }
        } 
        
    }
    static void dfs(int row,int col,char[][] mat,int[][] vis,int[] delrow,int[] delcol){
        vis[row][col]=1;
         int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='O') 
                dfs(nrow,ncol,mat,vis,delrow,delcol);
        }
    }
}

