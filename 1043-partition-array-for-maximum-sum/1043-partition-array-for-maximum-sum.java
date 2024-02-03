class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int n = arr.length;
       int[] dp = new int[n+1];
       
       for(int i=1;i<=n;i++){
           int len=0;
           int max = Integer.MIN_VALUE;
           int maxAns = Integer.MIN_VALUE;
           for(int j=i-1;j>=0&&(i-j)<=k;j--){
               len++;
               max = Math.max(max,arr[j]);
               int sum = len*max+dp[j];
               maxAns = Math.max(maxAns,sum);
           }
               dp[i] = maxAns;
       }
       return dp[n];
    }
}
