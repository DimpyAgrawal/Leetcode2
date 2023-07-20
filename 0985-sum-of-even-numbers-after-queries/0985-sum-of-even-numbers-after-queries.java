class Solution {
    public int[] sumEvenAfterQueries(int[]  A, int[][] queries) {
        
//         int[] ans=new int[q.length];
//         int k=0;
//         for(int row=0;row<q.length;row++){
            
//                 int idx=q[row][1];
//             int val=q[row][0];
//                // System.out.println(idx);
//                 nums[idx]+=val;
            
            
//                 sum(nums,ans,k);
//                  k++;
            
//         }
        
//        return ans; 
//     }
//     public static void sum(int[] nums,int[] ans,int k){
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0) sum+=nums[i];
//         }
//         ans[k]=sum;
//         sum=0;
        
         int S = 0;
        for (int x: A)
            if (x % 2 == 0)
                S += x;

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }

        return ans;
    }
}