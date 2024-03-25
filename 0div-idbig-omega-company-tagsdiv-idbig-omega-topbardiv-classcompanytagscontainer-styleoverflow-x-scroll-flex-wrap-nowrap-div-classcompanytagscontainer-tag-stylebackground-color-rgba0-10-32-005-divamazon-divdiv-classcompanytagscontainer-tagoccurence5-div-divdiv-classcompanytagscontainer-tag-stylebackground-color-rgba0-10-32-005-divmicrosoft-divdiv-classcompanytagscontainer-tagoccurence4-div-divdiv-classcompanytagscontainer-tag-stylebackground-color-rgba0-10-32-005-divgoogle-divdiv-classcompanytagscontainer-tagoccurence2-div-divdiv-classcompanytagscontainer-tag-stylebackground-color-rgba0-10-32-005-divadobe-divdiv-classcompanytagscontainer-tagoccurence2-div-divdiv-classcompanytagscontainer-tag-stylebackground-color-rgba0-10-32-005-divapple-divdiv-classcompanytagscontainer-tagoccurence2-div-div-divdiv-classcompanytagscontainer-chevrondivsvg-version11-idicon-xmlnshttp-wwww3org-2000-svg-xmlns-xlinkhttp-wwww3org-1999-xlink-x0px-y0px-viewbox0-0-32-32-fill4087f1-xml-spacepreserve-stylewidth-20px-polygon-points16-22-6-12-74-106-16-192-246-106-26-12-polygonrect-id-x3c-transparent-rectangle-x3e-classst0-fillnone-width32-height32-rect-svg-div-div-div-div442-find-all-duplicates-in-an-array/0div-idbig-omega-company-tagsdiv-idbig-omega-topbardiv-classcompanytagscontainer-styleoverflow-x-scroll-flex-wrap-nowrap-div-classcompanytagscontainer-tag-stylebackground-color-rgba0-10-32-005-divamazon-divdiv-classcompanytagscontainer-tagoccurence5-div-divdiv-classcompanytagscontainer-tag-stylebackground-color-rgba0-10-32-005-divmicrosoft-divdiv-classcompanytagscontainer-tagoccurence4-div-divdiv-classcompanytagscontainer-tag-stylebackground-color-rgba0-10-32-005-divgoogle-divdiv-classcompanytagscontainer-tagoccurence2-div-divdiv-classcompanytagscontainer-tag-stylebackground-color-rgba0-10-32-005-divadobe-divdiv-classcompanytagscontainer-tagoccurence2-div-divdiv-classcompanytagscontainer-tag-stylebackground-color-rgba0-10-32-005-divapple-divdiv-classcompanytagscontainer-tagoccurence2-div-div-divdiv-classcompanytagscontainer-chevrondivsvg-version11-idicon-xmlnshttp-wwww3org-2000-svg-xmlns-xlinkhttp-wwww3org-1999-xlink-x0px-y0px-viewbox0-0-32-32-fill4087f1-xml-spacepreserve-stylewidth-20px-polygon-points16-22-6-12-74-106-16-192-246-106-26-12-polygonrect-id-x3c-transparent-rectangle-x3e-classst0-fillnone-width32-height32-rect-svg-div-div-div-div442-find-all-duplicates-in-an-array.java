class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
       int n=nums.length;
       int i=0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }
        for( i=0;i<n;i++){
            if(nums[i]!=i+1) list.add(nums[i]);
        }
        
        return list;
    }
}