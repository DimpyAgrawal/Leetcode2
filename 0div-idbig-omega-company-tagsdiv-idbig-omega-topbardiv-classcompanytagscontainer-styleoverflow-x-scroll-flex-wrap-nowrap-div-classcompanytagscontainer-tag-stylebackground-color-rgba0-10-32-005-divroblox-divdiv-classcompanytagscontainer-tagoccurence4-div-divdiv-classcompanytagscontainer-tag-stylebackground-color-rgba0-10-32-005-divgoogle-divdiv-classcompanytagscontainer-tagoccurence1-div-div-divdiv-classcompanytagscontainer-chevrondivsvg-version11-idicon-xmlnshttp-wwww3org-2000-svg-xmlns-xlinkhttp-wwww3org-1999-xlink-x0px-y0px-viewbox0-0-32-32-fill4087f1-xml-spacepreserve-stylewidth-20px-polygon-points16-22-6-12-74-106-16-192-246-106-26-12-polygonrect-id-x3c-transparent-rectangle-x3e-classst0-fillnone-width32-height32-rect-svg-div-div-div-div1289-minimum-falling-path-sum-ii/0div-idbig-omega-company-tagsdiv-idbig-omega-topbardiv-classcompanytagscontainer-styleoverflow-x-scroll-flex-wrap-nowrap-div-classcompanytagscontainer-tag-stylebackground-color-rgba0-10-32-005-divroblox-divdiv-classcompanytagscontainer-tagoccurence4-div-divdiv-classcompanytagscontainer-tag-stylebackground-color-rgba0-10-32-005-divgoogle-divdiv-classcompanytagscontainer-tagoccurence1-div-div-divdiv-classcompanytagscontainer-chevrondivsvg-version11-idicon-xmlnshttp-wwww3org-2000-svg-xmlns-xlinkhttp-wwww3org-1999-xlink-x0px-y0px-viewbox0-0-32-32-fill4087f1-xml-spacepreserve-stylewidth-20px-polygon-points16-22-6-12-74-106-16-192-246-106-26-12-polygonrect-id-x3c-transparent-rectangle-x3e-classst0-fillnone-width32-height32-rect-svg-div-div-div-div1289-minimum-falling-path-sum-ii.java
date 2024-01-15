class Solution {
    public int minFallingPathSum(int[][] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){ 
               int ans = Integer.MAX_VALUE;
               for(int k=0;k<arr[0].length;k++){
                   if(j!=k) ans = Math.min(ans,arr[i-1][k]);
               }
               arr[i][j] += ans;
            }
        }
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<arr[0].length;i++){
            ans = Math.min(ans,arr[arr.length-1][i]);
        }
       return ans;
    }
}
