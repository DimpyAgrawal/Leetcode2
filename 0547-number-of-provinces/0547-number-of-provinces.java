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






























// class Solution {
//   private void dfs(int city, int[][] isConnected, boolean[] seen) {
//     seen[city] = true;

//     for (var i = 0; i < isConnected.length; i++)
//       if (isConnected[city][i] == 1 && !seen[i])
//         dfs(i, isConnected, seen);
//   }

//   public int findCircleNum(int[][] isConnected) {
//     var n = isConnected.length;
//     var seen = new boolean[n];
//     var cnt = 0;

//     for (var i=0; i<n; i++) {
//       if (!seen[i]) {
//         dfs(i, isConnected, seen);
//         cnt++;
//       }
//     }
//     return cnt;
//   }
// }