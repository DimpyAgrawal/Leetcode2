class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        
        combination(candidates, ll, ans,0,target);
        return ans;
	}
    
    public static void combination(int[] arr, List<Integer> ll,  List<List<Integer>> ans,int sum, int target){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=sum;i<arr.length;i++){
            if(target>=arr[i]){
                ll.add(arr[i]);
            combination(arr,ll,ans,i,target-arr[i]);
            ll.remove(ll.size()-1);
            }
        }
    }
}