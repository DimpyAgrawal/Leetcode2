class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int i=0;
        int j=0;
        int k=0;
        while(i<nums.length){
            if(nums[i]<0) 
                neg[j++] = nums[i];
            else 
                pos[k++] = nums[i];
            i++;
        }

        i=0;
        j=0;
        k=0;
        while(j < pos.length && k < neg.length){
            nums[i++] = pos[j++];
            nums[i++] = neg[k++];
        }
        
        // Copy any remaining elements from pos and neg arrays
        while(j < pos.length){
            nums[i++] = pos[j++];
        }
        
        while(k < neg.length){
            nums[i++] = neg[k++];
        }

        return nums;
    }
}
