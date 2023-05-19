class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int count=0;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         sum=0;
        //         for(int k1=i;k1<=j;k1++){
        //              sum+=nums[k1];
        //         }
        //           if(sum%k==0)
        //         count++;
        //     }
        // }
        // return count;
        
        
       //  int n=nums.length;
       //  int sum=0;
       //  int ans=0;
       // int[] arr=new int[k];
       //  arr[0]=1;
       //  for(int a:nums){
       //      sum = (sum + a % k + k) % k;
       //      ans+= arr[sum]++;
       //  }
       //  return ans;
        
        
         int[] count = new int[k];
    int prefixSum = 0, result = 0;
    count[0] = 1;
    for (int num : nums) {
        prefixSum = (prefixSum + num) % k;
        if (prefixSum < 0) {
            prefixSum += k;
        }
        result += count[prefixSum];
        count[prefixSum]++;
    }
    return result;
    }
}
