class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll= new ArrayList<>();
		List<List<Integer>> ans= new ArrayList<>();
		
		combination_sum( candidates,target,ll,ans,0 );
        return ans;
    }
    public static void combination_sum(int[] arr,int target,List<Integer> ll,List<List<Integer>> ans,int sum ) {
			if(target==0) {
				//System.out.println(ans);
				ans.add(new ArrayList<>(ll));
				return;
			}
			for(int i=sum;i<arr.length;i++) {
				if(target>=arr[i]){
					ll.add(arr[i]);
				combination_sum( arr,target-arr[i],ll,ans,i );
				ll.remove(ll.size()-1);
                }
			}
				
		}
}