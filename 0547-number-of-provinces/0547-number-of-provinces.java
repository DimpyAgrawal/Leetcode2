class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] vis = new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,isConnected,vis);
            }
        }
        return cnt;
    }
    
    public static void dfs(int node, int[][] isConnected,int[] vis){
        vis[node]=1;
        
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && vis[i]==0){
                dfs(i,isConnected,vis);
            }
        }
    }
}
