class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      // List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
      
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left=i+1;
            int right=nums.length-1;
           
               while(left<right){
                    if(nums[i]+nums[left]+nums[right]==0){
                         List<Integer> ll=new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[left]);
                        ll.add(nums[right]);
                          ans.add(ll);
                        left+=1;
                        
                    
                   while(nums[left]==nums[left-1]&& left<right){
                        left+=1;
                   }
                      
                    }
                
                if(nums[i]+nums[left]+nums[right]>0) right-=1;
            else left+=1;
        }
        }
        return ans;
    }
}