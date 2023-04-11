class Solution {
   public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return ans;
        //Arrays.sort(nums);
        solve(nums, ans, new ArrayList<>() );
        return ans;
   }
   public void solve(int[] nums,List<List<Integer>> ans,List<Integer> list){
       if(nums.length==list.size()){
           ans.add(new ArrayList<>(list));
           return;

       }
       for(int i=0;i<nums.length;i++){
           if(list.contains(nums[i])) continue;
           list.add(nums[i]);
           solve(nums,ans,list);
           list.remove(list.size()-1);
           
       }
       
   }
}