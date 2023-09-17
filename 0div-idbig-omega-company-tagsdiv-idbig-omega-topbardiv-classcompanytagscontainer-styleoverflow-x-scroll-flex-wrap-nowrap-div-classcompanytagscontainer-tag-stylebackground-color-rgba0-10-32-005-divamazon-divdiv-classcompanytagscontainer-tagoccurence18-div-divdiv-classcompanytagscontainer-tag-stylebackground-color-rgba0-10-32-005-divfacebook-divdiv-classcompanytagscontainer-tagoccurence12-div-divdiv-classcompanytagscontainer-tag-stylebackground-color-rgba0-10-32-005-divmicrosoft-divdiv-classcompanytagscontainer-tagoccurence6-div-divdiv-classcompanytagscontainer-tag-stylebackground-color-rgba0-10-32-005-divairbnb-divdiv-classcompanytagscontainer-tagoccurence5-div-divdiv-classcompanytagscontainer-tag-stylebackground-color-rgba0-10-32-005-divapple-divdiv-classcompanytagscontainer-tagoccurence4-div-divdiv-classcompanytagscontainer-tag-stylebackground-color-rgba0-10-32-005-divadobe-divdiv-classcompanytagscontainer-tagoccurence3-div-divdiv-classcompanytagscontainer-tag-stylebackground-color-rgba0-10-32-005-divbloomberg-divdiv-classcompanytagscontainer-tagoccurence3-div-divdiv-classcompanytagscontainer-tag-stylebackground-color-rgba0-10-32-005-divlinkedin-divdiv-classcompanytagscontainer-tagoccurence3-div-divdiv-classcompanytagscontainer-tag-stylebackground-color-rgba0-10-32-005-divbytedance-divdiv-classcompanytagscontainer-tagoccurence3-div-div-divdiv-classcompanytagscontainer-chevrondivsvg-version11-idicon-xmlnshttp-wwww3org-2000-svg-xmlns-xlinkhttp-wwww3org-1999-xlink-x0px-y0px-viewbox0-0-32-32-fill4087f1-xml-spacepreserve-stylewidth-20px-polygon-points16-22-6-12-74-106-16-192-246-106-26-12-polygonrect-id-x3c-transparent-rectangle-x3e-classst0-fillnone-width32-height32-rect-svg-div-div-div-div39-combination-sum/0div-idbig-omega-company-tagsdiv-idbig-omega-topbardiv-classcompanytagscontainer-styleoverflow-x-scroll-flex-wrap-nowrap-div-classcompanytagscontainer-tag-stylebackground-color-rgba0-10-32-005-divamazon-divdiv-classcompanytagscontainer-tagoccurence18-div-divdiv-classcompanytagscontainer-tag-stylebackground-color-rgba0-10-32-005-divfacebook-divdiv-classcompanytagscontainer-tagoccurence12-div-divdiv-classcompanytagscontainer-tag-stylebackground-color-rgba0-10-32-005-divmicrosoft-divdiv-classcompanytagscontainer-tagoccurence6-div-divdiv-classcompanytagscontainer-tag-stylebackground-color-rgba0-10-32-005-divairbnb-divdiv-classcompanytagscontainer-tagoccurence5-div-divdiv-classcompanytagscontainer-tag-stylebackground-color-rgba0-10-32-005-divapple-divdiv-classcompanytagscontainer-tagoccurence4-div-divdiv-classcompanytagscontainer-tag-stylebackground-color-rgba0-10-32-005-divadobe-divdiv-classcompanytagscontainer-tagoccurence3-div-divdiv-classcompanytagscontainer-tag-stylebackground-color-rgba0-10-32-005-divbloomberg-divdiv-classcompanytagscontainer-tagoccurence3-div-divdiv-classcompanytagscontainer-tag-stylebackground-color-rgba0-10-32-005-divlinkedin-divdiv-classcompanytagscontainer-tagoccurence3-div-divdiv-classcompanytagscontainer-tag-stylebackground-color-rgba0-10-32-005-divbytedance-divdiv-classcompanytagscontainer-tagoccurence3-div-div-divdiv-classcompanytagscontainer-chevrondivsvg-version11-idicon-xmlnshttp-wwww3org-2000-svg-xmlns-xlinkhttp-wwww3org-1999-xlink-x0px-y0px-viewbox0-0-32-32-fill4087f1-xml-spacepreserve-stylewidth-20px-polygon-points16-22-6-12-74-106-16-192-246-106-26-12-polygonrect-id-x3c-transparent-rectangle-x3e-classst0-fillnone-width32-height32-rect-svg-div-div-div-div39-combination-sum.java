class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
    List<Integer> ds=new ArrayList<>();
    List<List<Integer>> ans= new ArrayList<>();
       combination_sum(0,candidates,target,ds,ans); 
        
        return ans;
        
    
    }
    
    public static void combination_sum(int ind,int[] arr,int target,List<Integer> ds, List<List<Integer>> ans){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
                if(arr[ind]<=target){
                    ds.add(arr[ind]);
                    combination_sum(ind,arr,target-arr[ind],ds,ans);
                    ds.remove(ds.size()-1);
                
            }
        combination_sum(ind+1,arr,target,ds,ans);
    }
}