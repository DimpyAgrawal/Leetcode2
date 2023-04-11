class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> ans= new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         boolean[] visit=new boolean[nums.length];
         Arrays.sort(nums); 
         solve(nums,list,ans,visit);
         return ans;
    }
    public void solve(int[] nums,List<Integer> list,List<List<Integer>> ans, boolean[] visit){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            // if(list.contains(nums[i])) continue;
            if(visit[i]||(i>0 && nums[i]==nums[i-1] && !visit[i-1]) ) continue;
            list.add(nums[i]);
            visit[i]=true;
            solve(nums,list,ans,visit);
              visit[i]=false;
            list.remove(list.size()-1);
        }
    }
}