class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> repeatedSet = new HashSet<>();
         int pairs=0;

         for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) repeatedSet.add(nums[i]);
            else set.add(nums[i]);
         }
         if(k==0) return  repeatedSet.size();
         for(int ele : set){
            if(set.contains(ele+k)) pairs++;
         }
         return pairs;
    }
}