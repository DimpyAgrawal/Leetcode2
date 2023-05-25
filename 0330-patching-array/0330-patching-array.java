class Solution {
    public int minPatches(int[] nums, int n) {
       int c=0;
       long missing=1;
       int i=0;
        while(missing<=n){
            if(i<nums.length && missing>=nums[i]){
                missing+=nums[i]; i++;
            }
            else{
                missing+=missing;
                c++;
            }
        }
        return c;
    }
}