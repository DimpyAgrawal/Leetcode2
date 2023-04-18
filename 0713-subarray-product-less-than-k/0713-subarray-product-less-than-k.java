class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ei=0;
        int si=0;
        int ans=0;
        int p=1;
        while(ei<nums.length){
                p*=nums[ei];
             if(p==0 || k==0){
                ans=0;
                break;
            }
            else if(p==1 && k==1){
                ans=0;
                break;
            }
            
            while(p>=k){
                p/=nums[si];
                si++;
            }
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}