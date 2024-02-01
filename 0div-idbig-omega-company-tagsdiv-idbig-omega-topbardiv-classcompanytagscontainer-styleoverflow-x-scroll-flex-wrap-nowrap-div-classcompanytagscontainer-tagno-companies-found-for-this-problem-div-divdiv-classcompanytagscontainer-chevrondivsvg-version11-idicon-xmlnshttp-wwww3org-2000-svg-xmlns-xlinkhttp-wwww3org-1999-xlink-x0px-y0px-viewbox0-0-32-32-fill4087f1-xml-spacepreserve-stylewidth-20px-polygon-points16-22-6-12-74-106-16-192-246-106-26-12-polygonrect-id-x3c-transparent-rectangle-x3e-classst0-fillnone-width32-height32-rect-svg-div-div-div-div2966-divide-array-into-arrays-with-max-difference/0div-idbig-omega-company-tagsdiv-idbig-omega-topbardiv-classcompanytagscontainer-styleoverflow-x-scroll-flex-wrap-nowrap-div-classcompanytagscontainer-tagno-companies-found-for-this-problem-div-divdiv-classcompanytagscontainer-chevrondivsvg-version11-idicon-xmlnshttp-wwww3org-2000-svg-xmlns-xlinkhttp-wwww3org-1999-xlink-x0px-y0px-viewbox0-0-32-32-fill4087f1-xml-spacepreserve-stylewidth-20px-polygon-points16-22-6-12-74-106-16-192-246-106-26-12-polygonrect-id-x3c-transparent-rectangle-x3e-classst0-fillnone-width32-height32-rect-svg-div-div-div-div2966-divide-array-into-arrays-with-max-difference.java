class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length/3][3];
        int ind = 0;
        for(int i=0;i<nums.length;i+=3){
            if(nums[i+2]-nums[i]<=k){
                ans[ind][0] = nums[i];
                ans[ind][1] = nums[i+1];
                ans[ind][2] = nums[i+2];
                ind++;
            }
            else{
              return new int[0][0];
            }
        }
        return ans;

     }
}