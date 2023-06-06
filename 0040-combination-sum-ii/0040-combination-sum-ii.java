class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<Integer> ds=new ArrayList<>();
    List<List<Integer>> ans= new ArrayList<>();
       combination_sum(candidates,target,0,ds,ans); 
        
        return ans;
        
    
    }
    
    public static void combination_sum(int[] arr,int target,int sum,List<Integer> ds, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
            
            
            
            for(int i=sum;i<arr.length;i++){
                if(i==sum||arr[i]!=arr[i-1]){
                if(arr[i]<=target){
                    ds.add(arr[i]);
                    combination_sum(arr,target-arr[i],i+1,ds,ans);
                    ds.remove(ds.size()-1);
                }
                }
            }
		}
}